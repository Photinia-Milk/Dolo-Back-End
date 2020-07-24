package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.SectionCourseTimeSlotVO;
import sjtu.dolo.model.TakesCourseStudentVO;

import java.util.List;

public interface StudentService {

    List<Course> findCourseValid(Integer startIdx, Integer pageSize);

    List<SectionCourseTimeSlotVO> findCourse(String searchString, Integer startIdx, Integer pageSize);

    List<Section> findSectionValid(String courseId);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<TakesCourseStudentVO> findTakeList(String studentID);
}
