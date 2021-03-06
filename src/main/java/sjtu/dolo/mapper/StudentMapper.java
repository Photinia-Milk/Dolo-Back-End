package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Student;
import sjtu.dolo.model.Takes;

import java.util.List;
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {
     int addNewStudent(String userName, String name);
     Student getStuInfo(String userName);
}
