package sjtu.dolo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sjtu.dolo.model.Section;
import sjtu.dolo.utils.MybatisUtils;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper =  sqlSession.getMapper(StudentMapper.class);
        List<Section> allSection = mapper.getAllSection();

        for (Section section : allSection) {
            System.out.println(section);
        }
        sqlSession.close();
    }
}
