package sjtu.dolo.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.model.SectionCourseTimeSlotVO;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.service.StudentService;
import sjtu.dolo.utils.msgutils.Msg;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest extends CourseApplicationTests {

    @Test
    public void contentLoads(){}

    // 屏蔽http网络请求
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginController loginController;

    private ObjectMapper om = new ObjectMapper();

    @Before
    public void setUp(){mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach
    void tearDown(){}

    @Test
    public void login() throws Exception{
        JSONObject data = new JSONObject();
        String username = "student1";
        String password = "123456";
        data.put("username",username);
        data.put("password",password);
        Msg msg = loginController.login(data);
        System.out.println(msg.toString());
//        System.out.println(data.toString());
//        System.out.println(mockMvc.toString());
//        MvcResult mvcResult = mockMvc.perform(post("http://localhost:8081/api/login").content(data.toString()).contentType(MediaType.APPLICATION_JSON_VALUE))
////                .andExpect(jsonPath("$.data.username", is("test")))
////                .andExpect(jsonPath("$.data.password", is("password")))
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(status().isOk())
//                .andReturn();

//        System.out.println("HaHa");
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        Msg msg = om.readValue(resultContent, new TypeReference<Msg>() {});
//        assertEquals(loginService.login(username, password), msg);
    }
}
