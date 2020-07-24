package sjtu.dolo.mapper;

import org.junit.Test;
import org.apache.ibatis.session.SqlSession;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.utils.MybatisUtils;

import java.util.List;

public class TakesMapperTest extends CourseApplicationTests {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TakesMapper mapper =  sqlSession.getMapper(TakesMapper.class);
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        Map<String,Integer> map = null;
//        map.put("startIndex",1);
//        map.put("pageSize",3);

        Takes takes = new Takes("1","2020-2021","AD001","student0",null,null,"teacher130");
        int num = mapper.insert(takes);
        System.out.println(takes);
        System.out.println(num);
        sqlSession.commit();
        sqlSession.close();
    }
}
