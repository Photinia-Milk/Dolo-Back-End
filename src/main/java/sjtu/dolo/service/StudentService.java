package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;

import java.util.List;

public interface StudentService {
    List<Section> findSectionValid();

    String addCourseTakes(JSONObject data);

    String delCourseTakes(JSONObject data);

    List<Takes> findTakeList(String studentID);
}
