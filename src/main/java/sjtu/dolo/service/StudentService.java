package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.SectionCourseTimeSlotVO;
import sjtu.dolo.model.TakesCourseStudentVO;

import java.util.List;

public interface StudentService {
//    List<Map> findSectionValid();

    List<SectionCourseTimeSlotVO> findSectionValid(Integer startIdx, Integer pageSize);

    List<SectionCourseTimeSlotVO> findSection(String searchString, Integer startIdx, Integer pageSize);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<TakesCourseStudentVO> findTakeList(String studentID);
}
