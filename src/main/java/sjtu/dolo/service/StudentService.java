package sjtu.dolo.service;

import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

public interface StudentService {
//    List<Map> findSectionValid();

    List<Map<String, Object>> findSectionValid(int startIdx, int pageSize);

    List<Map<String, Object>> findSection(String searchString, int startIdx, int pageSize);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<Map<String, Object>> findTakeList(String studentID);
}
