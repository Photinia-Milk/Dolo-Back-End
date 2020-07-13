package sjtu.dolo.controller;


import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.msgutils.Msg;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    LoginService loginService;

//    @RequestMapping("/logout")
//    @ResponseBody
//    public void logout(@RequestBody Map<String, String> params){
//        return ;
//    }

    @RequestMapping("/login")
    @ResponseBody
    public Msg login(@RequestBody JSONObject data) {
        String username = data.getString("username");
        String password = data.getString("password");
        return loginService.login(username, password);
    }

}
