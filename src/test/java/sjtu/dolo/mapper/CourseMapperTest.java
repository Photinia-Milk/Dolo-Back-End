package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.utils.MybatisUtils;

public class CourseMapperTest extends CourseApplicationTests {
    @Test
    public void getSectionLikeTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        Map<String,Integer> map = null;
//        map.put("startIndex", 1);
//        map.put("pageSize", 3);

        int num = mapper.getPageNumber(10);
        System.out.println(num);
        sqlSession.close();
    }
}
