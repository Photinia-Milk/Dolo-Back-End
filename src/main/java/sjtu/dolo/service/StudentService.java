package sjtu.dolo.service;

import net.sf.json.JSONObject;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;

import java.util.List;
public interface StudentService {
    List<Section> findSectionValid();

    List<Section> findSection(String searchString);

    int addCourseTakes(JSONObject data);

    int delCourseTakes(JSONObject data);

    List<Takes> findTakeList(String studentID);
}
