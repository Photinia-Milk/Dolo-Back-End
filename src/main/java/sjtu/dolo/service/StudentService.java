package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.*;

import java.util.List;
import java.util.Map;

public interface StudentService {

    CourseNumListVO findCourseValid(Integer startIdx, Integer pageSize);

    CourseNumListVO findCourse(String searchString, Integer startIdx, Integer pageSize);

    List<Section> findSectionValid(String courseId);

    int addCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName);

    int delCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName);

    List<TakesCourseStudentVO> findTakeList(String studentID);

    GpaVO getGPA(String userName, String from, String to, String type);

    Student getStuInfo(String userName);
}
