package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Student;
import sjtu.dolo.model.Takes;
import sjtu.dolo.utils.MybatisUtils;

import java.math.BigDecimal;
import java.util.*;

public class StudentMapperTest extends CourseApplicationTests {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SectionMapper mapper =  sqlSession.getMapper(SectionMapper.class);
        Map<String,Integer> map = new HashMap<String,Integer>();
//        Map<String,Integer> map = null;
        map.put("startIndex",1);
        map.put("pageSize",3);

        List<Map<String,Object>> allSection = mapper.getSectionByLimit(map);

        for (Map<String,Object> map1: allSection) {
            System.out.println(map1);
        }
        sqlSession.close();
    }
    @Test
    public void testTakes()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper takesMapper = sqlSession.getMapper(StudentMapper.class);
        BigDecimal grade = BigDecimal.valueOf(83);
        BigDecimal gpa = BigDecimal.valueOf(4.0);
        int res = takesMapper.addTakes(new Takes("1","2","2019","6","1","liujinke",grade,gpa));
        System.out.println(res);
        //sqlSession.commit();
        sqlSession.close();
    }
}
