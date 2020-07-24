//package sjtu.dolo.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import net.sf.json.JSONObject;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.fasterxml.jackson.core.type.TypeReference;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.context.WebApplicationContext;
//import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.model.SectionCourseVO;
//import sjtu.dolo.model.TakesCourseStudentVO;
//import sjtu.dolo.service.StudentService;
//
//import java.util.List;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class StudentControllerTest extends CourseApplicationTests {
//    @Test
//    public void contentLoads(){}
//
//    // 屏蔽http网络请求
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext context;
//
//    @Autowired
//    private StudentService studentService;
//
//    @Autowired
//    private StudentController studentController;
//
//    private ObjectMapper om = new ObjectMapper();
//
//    @Before
//    public void setUp(){mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//
//    @AfterEach
//    void tearDown(){}
//
//    @Test
//    public void getCourseValid() throws Exception {
//
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        int startIdx = 0;
//        int pageSize = 3;
//<<<<<<< HEAD
//        params.add("start_index", String.valueOf(startIdx));
//        params.add("page_size", String.valueOf(pageSize));
//        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/student/course_valid").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
//=======
//        params.add("startIndex", String.valueOf(startIdx));
//        params.add("pageSize", String.valueOf(pageSize));
//        MvcResult mvcResult = mockMvc.perform(get("api/student/course_valid").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
//>>>>>>> 7b67cbd57d749379262141988a3afe7e1b9f4407
//        .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        List<SectionCourseVO> sectionCourseVOS = om.readValue(resultContent, new TypeReference<List<SectionCourseVO>>() {});
//        // 取出数量相等断言
//        assertEquals(studentService.findSectionValid(startIdx, pageSize).size(), sectionCourseVOS.size());
//    }
//
//    @Test
//    public void searchCourse() throws Exception {
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        int startIdx = 0;
//        int pageSize = 3;
//        String searchString = "key";
//        params.add("start_index", String.valueOf(startIdx));
//        params.add("page_size", String.valueOf(pageSize));
//        params.add("key", searchString);
//        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/student/course_search").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        List<SectionCourseVO> sectionCourseVOS = om.readValue(resultContent, new TypeReference<List<SectionCourseVO>>() {});
//        // 取出数量相等断言
//        assertEquals(studentService.findSection(searchString, startIdx, pageSize).size(), sectionCourseVOS.size());
//    }
//
//    @Test
//    public void selectCourse() throws Exception {
//        JSONObject data = new JSONObject();
//        // data 初始化没做！！！！！
//        MvcResult mvcResult = mockMvc.perform(post("http://localhost:8080/api/student/course_select").content(data.toString()).contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        int status = om.readValue(resultContent, new TypeReference<Integer>() {});
//        // 状态相等断言
//        assertEquals(studentService.addCourseTakes(data), status);
//    }
//
//    @Test
//    public void dropCourse() throws Exception {
//        JSONObject data = new JSONObject();
//        // data 初始化没做！！！！！
//        MvcResult mvcResult = mockMvc.perform(post("http://localhost:8080/api/student/course_drop").content(data.toString()).contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        int status = om.readValue(resultContent, new TypeReference<Integer>() {});
//        // 状态相等断言
//        assertEquals(studentService.delCourseTakes(data), status);
//    }
//
//    @Test
//    public void getCourseList() throws Exception {
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        String user_name = "user_name";
//        params.add("user_name", user_name);
//        MvcResult mvcResult = mockMvc.perform(get("http://localhost:8080/api/student/course_list").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        List<TakesCourseStudentVO> takesCourseStudentVOS = om.readValue(resultContent, new TypeReference<List<TakesCourseStudentVO>>() {});
//        // 取出数量相等断言
//        assertEquals(studentService.findTakeList(user_name).size(), takesCourseStudentVOS.size());
//
//    }
//}
