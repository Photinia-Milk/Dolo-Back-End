package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.CourseNumListVO;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.TakesCourseStudentVO;

import java.util.List;
import java.util.Map;

public interface StudentService {

    CourseNumListVO findCourseValid(Integer startIdx, Integer pageSize);

    CourseNumListVO findCourse(String searchString, Integer startIdx, Integer pageSize);

    List<Section> findSectionValid(String courseId);

    int addCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName);

    int delCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName);

    List<TakesCourseStudentVO> findTakeList(String studentID);
}
