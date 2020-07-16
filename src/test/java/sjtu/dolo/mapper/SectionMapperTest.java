package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.SectionCourseTimeSlotVO;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SectionMapperTest extends CourseApplicationTests {
    @Test
    public void getSectionLikeTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SectionMapper mapper =  sqlSession.getMapper(SectionMapper.class);
        Map<String,Integer> map = new HashMap<String,Integer>();
//        Map<String,Integer> map = null;
        map.put("startIndex",1);
        map.put("pageSize",3);

        List<SectionCourseTimeSlotVO> allSection = mapper.getSectionLike("%ICS%",map);

        for (SectionCourseTimeSlotVO map1: allSection) {
            System.out.println(map1);
        }
        sqlSession.close();
    }
}
