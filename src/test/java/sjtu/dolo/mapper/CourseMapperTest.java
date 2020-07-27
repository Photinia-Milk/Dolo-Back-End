package sjtu.dolo.mapper;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Course;
import sjtu.dolo.utils.MybatisUtils;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseMapperTest extends CourseApplicationTests {
    @Test
    public void contextLoads(){

    }

    @Test
    public void getCourseTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        Map<String, Integer> map = new HashMap<String, Integer>();
//        Map<String,Integer> map = null;
        map.put("startIndex", 1);
        map.put("pageSize", 3);
        List<Course> courseList  = mapper.getCourse(map);
        System.out.println(courseList);
        sqlSession.close();
    }
}
