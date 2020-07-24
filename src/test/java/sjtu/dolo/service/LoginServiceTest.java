//package sjtu.dolo.service;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.mapper.UserAuthMapper;
//import sjtu.dolo.model.UserAuth;
//import sjtu.dolo.serviceimpl.LoginServiceImpl;
//import sjtu.dolo.serviceimpl.StudentServiceImpl;
//import sjtu.dolo.utils.msgutils.Msg;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class LoginServiceTest extends CourseApplicationTests {
//
//    @TestConfiguration
//    static class LoginServiceImplyTestContextConfiguration{
//        @Bean
//        public LoginService loginService() {
//            return new LoginServiceImpl();
//        }
//    }
////    @Test
////    public void contextLoads() {
////
////    }
//
//    @Autowired
//    private LoginService loginService;
//
//    @MockBean
//    private UserAuthMapper userAuthMapper;
//
//    @Test
//    public void login(){
////        String usernameS = "amadeus";
////        String passwordS = "13867w";
////        UserAuth userAuthS = new UserAuth();
////        userAuthS.setUser_name("amadeus");
////        userAuthS.setPassword("13867w");
////        Msg msgS = new Msg(0, "1");
////        when(userAuthMapper.checkUser(usernameS, passwordS)).thenReturn(userAuthS);
////        assertEquals(msgS.getStatus(), loginService.login(usernameS,passwordS).getStatus());
////        assertEquals(msgS.getData(), loginService.login(usernameS,passwordS).getData());
//
//        String usernameA = "admin";
//        String passwordA = "admin";
//        UserAuth userAuthA = new UserAuth();
//        userAuthA.setUser_name("admin");
//        userAuthA.setPassword("admin");
//        Msg msgA = new Msg(0, "0");
//        when(userAuthMapper.checkUser(usernameA, passwordA)).thenReturn(userAuthA);
//        assertEquals(msgA.getStatus(), loginService.login(usernameA,passwordA).getStatus());
//        assertEquals(msgA.getData(), loginService.login(usernameA,passwordA).getData());
//
//        String usernameW = "admin";
//        String passwordW = "iamanidiot";
//        UserAuth userAuthW = new UserAuth();
//        userAuthW.setUser_name("admin");
//        userAuthW.setPassword("iamanidiot");
//        Msg msgW = new Msg(1, null);
//        when(userAuthMapper.checkUser(usernameW, passwordW)).thenReturn(userAuthW);
//        assertEquals(msgW.getStatus(), loginService.login(usernameW,passwordW).getStatus());
//        assertEquals(msgW.getData(), loginService.login(usernameW,passwordW).getData());
//    }
//}
