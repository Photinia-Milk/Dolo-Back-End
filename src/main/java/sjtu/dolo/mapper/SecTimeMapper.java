package sjtu.dolo.mapper;

import sjtu.dolo.model.SecTime;
import sjtu.dolo.model.Takes;

import java.util.List;
import java.util.Map;

public interface SecTimeMapper {
    int isConflict(Map<String,Integer> map,String userName,String semester,String year);
    List<SecTime> getSecTime(String semester,String year,String courseId,String teacherUserName);
}
