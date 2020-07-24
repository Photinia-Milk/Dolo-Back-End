//package sjtu.dolo.controller;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.context.WebApplicationContext;
//import sjtu.dolo.mapper.UserAuthMapper;
//import sjtu.dolo.model.UserAuth;
//import sjtu.dolo.service.LoginService;
//import sjtu.dolo.utils.MybatisUtils;
//import sjtu.dolo.utils.msgutils.Msg;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class LoginController {
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
//    private LoginService loginService;
//
//    @Autowired
//    private LoginController loginController;
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
//    public void login() throws Exception{
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        String username = "hey";
//        String password = "okay";
//        params.add("username", username);
//        params.add("password", password);
//        MvcResult mvcResult = mockMvc.perform(post("api/login").params(params).contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        String resultContent = mvcResult.getResponse().getContentAsString();
//        Msg msg = om.readValue(resultContent, new TypeReference<Msg>() {});
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserAuthMapper uMapper = sqlSession.getMapper(UserAuthMapper.class);
//        UserAuth userAuth = uMapper.checkUser(username, password);
//        sqlSession.commit();
//        sqlSession.close();
//        if (userAuth == null)
//        {
//            assertEquals(msg.getStatus(), 0);
//        }
//        else
//        {
//            assertEquals(msg.getStatus(), 1);
//        }
//    }
//}
