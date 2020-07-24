//package sjtu.dolo.mapper;
//
//import org.junit.Test;
//import org.apache.ibatis.session.SqlSession;
//import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.model.TakesCourseStudentVO;
//import sjtu.dolo.utils.MybatisUtils;
//
//import java.util.List;
//
//public class TakesMapperTest extends CourseApplicationTests {
//    @Test
//    public void test() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TakesMapper mapper =  sqlSession.getMapper(TakesMapper.class);
////        Map<String,Integer> map = new HashMap<String,Integer>();
////        Map<String,Integer> map = null;
////        map.put("startIndex",1);
////        map.put("pageSize",3);
//
//        List<TakesCourseStudentVO> allSection = mapper.getTakes("amadeus");
//
//        for (TakesCourseStudentVO map1: allSection) {
//            System.out.println(map1);
//        }
//        sqlSession.close();
//    }
//}
