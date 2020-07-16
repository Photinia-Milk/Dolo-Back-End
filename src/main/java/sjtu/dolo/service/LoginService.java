package sjtu.dolo.service;

import sjtu.dolo.utils.msgutils.Msg;

public interface LoginService {
    Msg login(String username, String password);
}
