package sjtu.dolo.service;

import sjtu.dolo.model.UserAuth;
import sjtu.dolo.utils.msgutils.Msg;

public interface LoginService {
    Msg login(String username, String password);
    UserAuth getOAuthUser(String userName, String name, String type);
}
