package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.SectionCourseTimeSlotVO;

import java.util.List;
import java.util.Map;

public interface StudentService {
//    List<Map> findSectionValid();

    List<SectionCourseTimeSlotVO> findSectionValid(Integer startIdx, Integer pageSize);

    List<Map<String, Object>> findSection(String searchString, Integer startIdx, Integer pageSize);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<Map<String, Object>> findTakeList(String studentID);
}
