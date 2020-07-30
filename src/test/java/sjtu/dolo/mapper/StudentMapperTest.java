package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Student;
import sjtu.dolo.utils.MybatisUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest extends CourseApplicationTests {
    @Test
    public void contextLoads(){
    }
    @Test
    public void getStuInfo(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStuInfo("student0");
        System.out.println(student.toString());
        sqlSession.close();
    }
}
