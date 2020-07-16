package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;
import sjtu.dolo.utils.MybatisUtils;

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
}
