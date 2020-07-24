package sjtu.dolo.mapper;

import sjtu.dolo.model.Course;

import java.util.List;
import java.util.Map;

public interface CourseMapper {
    List<Course> getCourse(Map<String,Integer> map);
    List<Course> getCourseLike(Map<String,Integer> map,String value);
    int getPageNumber();
    int getSearchPageNumber(String searchString);
}
