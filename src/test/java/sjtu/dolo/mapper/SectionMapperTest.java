package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.SectionCourseVO;
import sjtu.dolo.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectionMapperTest extends CourseApplicationTests {
    @Test
    public void getSectionLikeTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SectionMapper mapper = sqlSession.getMapper(SectionMapper.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
//        Map<String,Integer> map = null;
        map.put("startIndex", 1);
        map.put("pageSize", 3);

        List<SectionCourseVO> allSection = mapper.getSectionLike("%ICS%", map);

        for (SectionCourseVO map1 : allSection) {
            System.out.println(map1);
        }
        sqlSession.close();
    }
}
