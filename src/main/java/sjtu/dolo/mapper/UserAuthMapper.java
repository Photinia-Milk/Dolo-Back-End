package sjtu.dolo.mapper;

import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.UserAuth;
@Mapper
public interface UserAuthMapper {
     UserAuth checkUser(String userName,String password);
     UserAuth findUserAuthByUserName(String userName);
}
