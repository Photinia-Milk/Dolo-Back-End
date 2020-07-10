package sjtu.dolo.mapper;

import sjtu.dolo.model.UserAuth;

public interface UserAuthMapper {
     UserAuth checkUser(String userName,String password);
     UserAuth findUserAuthByUserName(String userName);
}
