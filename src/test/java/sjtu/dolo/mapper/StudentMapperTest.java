//package sjtu.dolo.mapper;
//
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.model.*;
//import sjtu.dolo.utils.MybatisUtils;
//
//import java.math.BigDecimal;
//import java.util.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class StudentMapperTest extends CourseApplicationTests {
//    @Test
//    public void contextLoads(){
//    }
//    @Test
//    public void test() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TakesMapper mapper =  sqlSession.getMapper(TakesMapper.class);
////        Map<String,Integer> map = new HashMap<String,Integer>();
////        Map<String,Integer> map = null;
////        map.put("startIndex",1);
////        map.put("pageSize",3);
//
//        List<TakesCourseStudentVO> allSection = mapper.getTakes("liujinke");
//
//        for (TakesCourseStudentVO map1: allSection) {
//            System.out.println(map1);
//        }
//        sqlSession.close();
//    }
//    @Test
//    public void testTakes ()
//    {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        StudentMapper takesMapper = sqlSession.getMapper(StudentMapper.class);
//        BigDecimal grade = BigDecimal.valueOf(83);
//        BigDecimal gpa = BigDecimal.valueOf(4.0);
//        int res = takesMapper.addTakes(new Takes("2","2","2019","2","3","liujinke",grade,gpa));
//        System.out.println(res);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void updateTest()
//    {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper takesMapper = sqlSession.getMapper(SectionMapper.class);
//        BigDecimal credits = BigDecimal.valueOf(4);
//        int res = takesMapper.update(new Section("1","2","2019","1","1","东下院","203",credits,"第一周到第十周",60,5));
//        System.out.println(res);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    @Test
//    public void deleteTest()
//    {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TakesMapper takesMapper = sqlSession.getMapper(TakesMapper.class);
//        BigDecimal grade = BigDecimal.valueOf(83);
//        BigDecimal gpa = BigDecimal.valueOf(4.0);
//        int res = takesMapper.delete(new Takes("2","2","2019","2","3","liujinke",grade,gpa));
//        System.out.println(res);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//}
