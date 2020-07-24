package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.SectionCourseVO;
import sjtu.dolo.model.TakesCourseStudentVO;

import java.util.List;

public interface StudentService {
//    List<Map> findSectionValid();

    List<SectionCourseVO> findSectionValid(Integer startIdx, Integer pageSize);

    List<SectionCourseVO> findSection(String searchString, Integer startIdx, Integer pageSize);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<TakesCourseStudentVO> findTakeList(String studentID);
}
