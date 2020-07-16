package sjtu.dolo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import sjtu.dolo.mapper.UserAuthMapper;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.utils.msgutils.Msg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

    @Test
    public void contextLoads() {

    }

    @Autowired
    private LoginService loginService;

    @MockBean
    private UserAuthMapper userAuthMapper;

    @Test
    public void login(){
        String username = "amadeus";
        String password = "13867w";
        UserAuth userAuth = new UserAuth();
        userAuth.setUser_name("amadeus");
        userAuth.setPassword("13867w");
        Msg msg = new Msg(0, "1");
        when(userAuthMapper.checkUser(username, password)).thenReturn(userAuth);
        assertEquals(msg, loginService.login(username,password));

    }
}
