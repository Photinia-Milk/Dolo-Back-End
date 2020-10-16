package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.UserAuth;
@Mapper
public interface UserAuthMapper extends BaseMapper<UserAuth> {
     UserAuth checkUser(String userName,String password);
     UserAuth findUserAuthByUserName(String userName);
     UserAuth getStudent(String userName);
     int createStudent(String userName, String userType);
}
