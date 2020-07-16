package sjtu.dolo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.service.StudentService;

import java.util.List;
import java.util.Map;

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
    private StudentController studentController;

    private ObjectMapper om = new ObjectMapper();

    @Before
    public void setUp(){mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach
    void tearDown(){}

    @RequestMapping("/course_valid")
    @ResponseBody
    public List<Map<String, Object>> getCourseValid(@RequestBody JSONObject data) {

        int startIdx = data.getInt("startIndex");
        int pageSize = data.getInt("pageSize");
        return studentService.findSectionValid(startIdx, pageSize);
    }


//
//    public void searchCourse()throws Exception {
//        int startIdx = data.getInt("startIndex");
//        int pageSize = data.getInt("pageSize");
//        String searchString = data.getString("searchString");
////        return studentService.findSection(searchString, startIdx, pageSize);
//    }
//
//    public void selectCourse() throws Exception {
//        return studentService.addCourseTakes(data);
//    }
//
//    public void dropCourse() throws Exception {
//        return studentService.delCourseTakes(data);
//    }
//
//    public void getCourseList() throws Exception {
//        return studentService.findTakeList(user_name);
//    }
}
