package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.msgutils.Msg;

@RestController
@RequestMapping("api")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public Msg login(@RequestBody JSONObject data) {
        System.out.println(data);
        String username = data.getString("username");
        String password = data.getString("password");
        System.out.println(username);
        System.out.println(password);
        return loginService.login(username, password);
    }

}
