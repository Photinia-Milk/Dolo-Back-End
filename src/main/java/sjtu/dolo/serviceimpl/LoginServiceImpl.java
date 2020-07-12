package sjtu.dolo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.UserAuthMapper;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.msgutils.Msg;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private UserAuthMapper userAuthMapper;


    @Override
    public Msg login(String username, String password) {
        UserAuth userAuth = userAuthMapper.checkUser(username, password);
        if(userAuth != null && (userAuth.getType()=="0" || userAuth.getType() == "1")){
            return new Msg(0, userAuth.getType().toString());
        } else {
            return new Msg(1, null);
        }
    }
}
