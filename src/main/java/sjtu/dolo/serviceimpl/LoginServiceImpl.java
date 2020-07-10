package sjtu.dolo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.UserAuthMapper;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.msgutils.Msg;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserAuthMapper userAuthMapper;


    @Override
    public Msg login(String username, String password) {
        UserAuth userAuth = userAuthMapper.checkUser(username, password);
        if(userAuth != null && userAuth.getUserType()==0 || userAuth.getUserType() == 1){
            return new Msg(0, userAuth.getUserType().toString());
        } else {
            return new Msg(1, null);
        }
        return null;
    }
}
