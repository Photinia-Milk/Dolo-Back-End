package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.CourseApplicationTests;
import sjtu.dolo.model.SecTime;
import sjtu.dolo.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecTimeMapperTest extends CourseApplicationTests {
    @Test
    public void isConflictTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SecTimeMapper mapper = sqlSession.getMapper(SecTimeMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("weeks",65535);
        map.put("weekDay",8);
        map.put("classNum",768);
        int result = mapper.isConflict(map,"student1");
        System.out.println(result);
        sqlSession.close();
    }
    @Test
    public void getSecTimeTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SecTimeMapper mapper = sqlSession.getMapper(SecTimeMapper.class);
        List<SecTime> secTimes = mapper.getSecTime("1","2020-2021","AD003","teacher131");
        for (SecTime secTime:secTimes)
        {
            System.out.println(secTime);
        }
        sqlSession.close();
    }
}
