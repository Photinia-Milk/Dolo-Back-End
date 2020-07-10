package sjtu.dolo.mapper;

import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.TimeSlot;

import java.util.List;

public interface AdminMapper {
    TimeSlot getTimeSlot(String id);
    boolean InsertTimeSlot(TimeSlot timeSlot);
    String InsertSection(Section section);
    String DeleteSection(Section section);
    String UpdateSection(Section section);
    Course getCourse(String id);
    List<Course> getAllCourse();

}
