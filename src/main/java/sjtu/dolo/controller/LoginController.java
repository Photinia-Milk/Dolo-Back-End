package sjtu.dolo.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sjtu.dolo.model.OAuthUser;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.Oauth2Properties;
import sjtu.dolo.utils.msgutils.Msg;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    private final Oauth2Properties oauth2Properties;

    private UserAuth currentUser;

    public LoginController(Oauth2Properties oauth2Properties) {
        this.oauth2Properties = oauth2Properties;
    }

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

    /**
     * 让用户跳转到 GitHub
     * 这里不能加@ResponseBody，因为这里是要跳转而不是返回响应
     * 另外LoginController也不能用@RestController修饰
     *
     * @return 跳转url
     */
    @GetMapping("/authorize")
    public String authorize() {
        System.out.println("redirect!");
        String url = oauth2Properties.getAuthorizeUrl() +
                "?client_id=" + oauth2Properties.getClientId() +
                "&redirect_uri=" + oauth2Properties.getRedirectUrl();
        log.info("授权url:{}", url);
        return "redirect:" + url;
    }

    /**
     * 回调接口，用户同意授权后，GitHub会重定向到此路径
     *
     * @param code GitHub重定向时附加的授权码，只能用一次
     * @return
     */
    @GetMapping("/oauth2/callback")
    public String callback(@RequestParam("code") String code) {
        log.info("code={}", code);
        // code换token
        String accessToken = getAccessToken(code);
        System.out.println("Get code success!");
        // token换userInfo
//        String userInfo = getUserInfo(accessToken);
        UserAuth userAuth = getUserInfo(accessToken);
        currentUser = userAuth;
        System.out.println("Get userInfo success!");
        log.info("重定向到home");
        return "redirect:/student/home";
    }

    @GetMapping("/student/home")
    public UserAuth home() {
        return currentUser;
    }

    private String getAccessToken(String code) {
        String url = oauth2Properties.getAccessTokenUrl() +
                "?client_id=" + oauth2Properties.getClientId() +
                "&client_secret=" + oauth2Properties.getClientSecret() +
                "&code=" + code +
                "&grant_type=authorization_code";
        log.info("getAccessToken url:{}", url);
        // 构建请求头
        HttpHeaders requestHeaders = new HttpHeaders();
        // 指定响应返回json格式
        requestHeaders.add("accept", "application/json");
        // 构建请求实体
        HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        // post 请求方式
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
        String responseStr = response.getBody();
        log.info("responseStr={}", responseStr);

        // 解析响应json字符串
        JSONObject jsonObject = JSONObject.parseObject(responseStr);
        String accessToken = jsonObject.getString("access_token");
        log.info("accessToken={}", accessToken);
        return accessToken;
    }

    private UserAuth getUserInfo(String accessToken) {
        String url = oauth2Properties.getUserInfoUrl();
        log.info("getUserInfo url:{}", url);
        // 构建请求头
        HttpHeaders requestHeaders = new HttpHeaders();
        // 指定响应返回json格式
//        requestHeaders.add("accept", "application/json");
        // AccessToken放在请求头中
        requestHeaders.add("Authorization", "token "+accessToken);
        // 构建请求实体
        HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);
        System.out.println("headers: "+requestHeaders);
        System.out.println("entity: "+requestEntity.toString());
        RestTemplate restTemplate = new RestTemplate();
        // get请求方式
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        String userInfo = response.getBody();
        // 将获取到的用户信息转为JSONObject以便处理
        JSONObject jsonInfo =JSONObject.parseObject(userInfo);
        String userName = jsonInfo.getString("login");
        String name = jsonInfo.getString("name");
        String type = jsonInfo.getString("type");
        UserAuth userAuth = loginService.getOAuthUser(userName, name, type);
        log.info("userInfo={}", userInfo);
        return userAuth;
    }
}

//@RestController
//@RequestMapping("api")
//public class LoginController {
//    @Autowired
//    LoginService loginService;
//
//    @PostMapping("/login")
//    @ResponseBody
//    public Msg login(@RequestBody JSONObject data) {
//        System.out.println(data);
//        String username = data.getString("username");
//        String password = data.getString("password");
//        System.out.println(username);
//        System.out.println(password);
//        return loginService.login(username, password);
//    }
//
//}
