package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.Admin;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.TimeSlot;

import java.util.List;

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    TimeSlot getTimeSlot(String id);
    boolean InsertTimeSlot(TimeSlot timeSlot);
    String InsertSection(Section section);
    String DeleteSection(Section section);
    String UpdateSection(Section section);
    Course getCourse(String id);
    List<Course> getAllCourse();

}
