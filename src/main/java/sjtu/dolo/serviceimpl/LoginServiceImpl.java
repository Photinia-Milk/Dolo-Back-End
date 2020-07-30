package sjtu.dolo.serviceimpl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.StudentMapper;
import sjtu.dolo.mapper.UserAuthMapper;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.MybatisUtils;
import sjtu.dolo.utils.msgutils.Msg;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private UserAuthMapper userAuthMapper;

    @Override
    public Msg login(String username, String password) {
        UserAuth userAuth = userAuthMapper.checkUser(username, password);
        System.out.println(userAuth);
        if(userAuth != null && (userAuth.getType().equals("teacher") || userAuth.getType().equals("student"))){
            return new Msg(0, userAuth.getType());
        } else {
            return new Msg(1, null);
        }
    }

    @Override
    public UserAuth getOAuthUser(String userName, String name , String type) {
        UserAuth userAuth = new UserAuth();
        // 先查找已有记录
        try{
            userAuth = userAuthMapper.getStudent(userName);
        }catch (Exception e){
            System.out.println("get user error report: "+e);
        }
        // 若不存在该用户，则在userAuth表中创建该用户
        if(userAuth != null){
            return userAuth;
        }else {
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            UserAuthMapper uMapper = sqlSession.getMapper(UserAuthMapper.class);
            StudentMapper sMapper = sqlSession.getMapper(StudentMapper.class);
            // 创建成功判断 & 异常抛出 （需提交事务）
            int createAuthStatus = 0;
            int createStudentStatus = 0;
            // 用户类型判断
            String userType = "unknown";
            if(type.equals("User")){
                userType = "student";
            }
            try{
                createAuthStatus = uMapper.createStudent(userName, type);
                System.out.println(createAuthStatus);
                createStudentStatus = sMapper.addNewStudent(userName, name);
                sqlSession.commit();
            }catch (Exception e2){
                System.out.println("create user error report: "+e2);
                sqlSession.rollback();
            }
            if(createAuthStatus == 1 && createStudentStatus == 1){
                userAuth = new UserAuth(userName, null, userType);
            }
        }

        return userAuth;
    }
}
