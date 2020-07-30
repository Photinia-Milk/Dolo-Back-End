package sjtu.dolo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.*;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.service.StudentService;
import sjtu.dolo.utils.msgutils.Msg;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest extends CourseApplicationTests {
    @Test
    public void contentLoads(){}

    // 屏蔽http网络请求
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private StudentService studentService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private StudentController studentController;

    private ObjectMapper om = new ObjectMapper();

    @Before
    public void setUp(){mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach
    void tearDown(){}

    @Test
    public void getCourseValid() throws Exception {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        int startIdx = 1;
        int pageSize = 3;
        params.add("startIndex", String.valueOf(startIdx));
        params.add("pageSize", String.valueOf(pageSize));
        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8081/api/student/course_valid").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        CourseNumListVO courseNumListVO = om.readValue(resultContent, new TypeReference<CourseNumListVO>() {});
        // 取出数量相等断言
        assertEquals(studentService.findCourseValid(startIdx, pageSize).getCourseList().size(), courseNumListVO.getCourseList().size());
    }

    @Test
    public void searchCourse() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        int startIdx = 0;
        int pageSize = 3;
        String searchString = "与";
        params.add("startIndex", String.valueOf(startIdx));
        params.add("pageSize", String.valueOf(pageSize));
        params.add("key", searchString);
        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8081/api/student/course_search").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        CourseNumListVO courseNumListVO = om.readValue(resultContent, new TypeReference<CourseNumListVO>() {});
        // 取出数量相等断言
        assertEquals(studentService.findCourse(searchString, startIdx, pageSize).getCourseList().size(), courseNumListVO.getCourseList().size());
    }

    @Test
    public void sectionValid() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        String courseId = "SE125";
        params.add("courseId", String.valueOf(courseId));
        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8081/api/student/section_valid").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        List<Section> sectionList = om.readValue(resultContent, new TypeReference<List<Section>>() {});
        assertEquals(studentService.findSectionValid(courseId).size(), sectionList.size());
    }

    @Test
    public void selectCourse() throws Exception {
        JSONObject data = new JSONObject();
        String userName = "student3";
        String courseId = "AV012";
        String teacherUserName = "teacher266";
        String semester = "1";
        String year = "2020-2021";
        data.put("userName", userName);
        data.put("courseId", courseId);
        data.put("teacherUserName", teacherUserName);
        data.put("semester", semester);
        data.put("year", year);
        System.out.println("Mock HAHA: ");
        System.out.println(mockMvc.toString());
        MvcResult mvcResult = mockMvc.perform(post("http://localhost:8081/api/student/course_select")
                .content(data.toString())
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        int status = om.readValue(resultContent, new TypeReference<Integer>() {});
        // 状态相等断言
        assertEquals(0, status);
        int status2 = studentService.delCourseTakes(userName,semester,year,courseId,teacherUserName);
    }
//
    @Test
    public void dropCourse() throws Exception {
        JSONObject data = new JSONObject();
        String userName = "student1";
        String courseId = "AD003";
        String teacherUserName = "teacher131";
        String semester = "1";
        String year = "2020-2021";
        data.put("userName", userName);
        data.put("courseId", courseId);
        data.put("teacherUserName", teacherUserName);
        data.put("semester", semester);
        data.put("year", year);
        MvcResult mvcResult = mockMvc.perform(post("http://localhost:8081/api/student/course_drop").content(data.toString()).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        int status0 = studentService.addCourseTakes(userName,semester,year,courseId,teacherUserName);
        int status = om.readValue(resultContent, new TypeReference<Integer>() {});
        // 状态相等断言
        assertEquals(0, status);
    }
//
    @Test
    public void getCourseList() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        String userName = "student66";
        params.add("userName", userName);
        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8081/api/student/course_list").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        List<TakesCourseStudentVO> takesCourseStudentVOS = om.readValue(resultContent, new TypeReference<List<TakesCourseStudentVO>>() {});
        // 取出数量相等断言
        System.out.println(takesCourseStudentVOS.size());
        assertEquals(studentService.findTakeList(userName).size(), takesCourseStudentVOS.size());

    }

    @Test
    public void getGPA() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        String userName = "student66";
        String  from = "2020-2021-1";
        String to = "2020-2021-1";
        String type = "";
        params.add("userName", userName);
        params.add("type", type);
        params.add("from",from);
        params.add("to", to);
        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8081/api/student/gpa").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk()).andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        GpaVO gpaVO = om.readValue(resultContent, new TypeReference<GpaVO>() {});
        // 取出VO类相等断言
        assertEquals(studentService.getGPA(userName, from, to, type).getAvgGpa(), gpaVO.getAvgGpa());
    }
}
