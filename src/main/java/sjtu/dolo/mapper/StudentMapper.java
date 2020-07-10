package sjtu.dolo.mapper;

import sjtu.dolo.model.Course;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;

import java.util.List;

public interface StudentMapper {
     List<Section> getAllSection();
     String addTakes(Takes takes);
     String delTakes(Takes takes);
     List<Takes> getAllTakes(String studentID);
}
