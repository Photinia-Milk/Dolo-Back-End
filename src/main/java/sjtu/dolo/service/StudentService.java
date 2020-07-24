package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.TakesCourseStudentVO;

import java.util.List;
import java.util.Map;

public interface StudentService {

    Map<Integer,List<Course>> findCourseValid(Integer startIdx, Integer pageSize);

    Map<Integer,List<Course>> findCourse(String searchString, Integer startIdx, Integer pageSize);

    List<Section> findSectionValid(String courseId);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    Map<Integer, List<TakesCourseStudentVO>> findTakeList(String studentID);
}
