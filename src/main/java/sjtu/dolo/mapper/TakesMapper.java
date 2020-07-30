package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import sjtu.dolo.model.GpaVO;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.model.TakesCourseVO;

import java.util.List;
import java.util.Map;

@Mapper
public interface TakesMapper extends BaseMapper<Takes> {

    List<Takes> findTakesByLimit(Map<String,Integer> map);
    List<Takes> findTakesLike(String value);

    int insert(Takes takes);

    @Select("select * from takes natural join course natural join section natural join sectime natural join timeslot where userName = #{username}")
    List<TakesCourseStudentVO> getTakes(String username);

//    @Select("select * from (takes natural join student) join course using (courseID) where user_name = #{username} limit #{startIndex},#{pageSize}")
//    List<TakesCourseStudentVO> getTakesByLimit(String username,Map<String,Integer> map);
//
//    @Select("select * from (takes natural join student) join course using (courseID) where user_name = #{username} and coursename like #{value}")
//    List<TakesCourseStudentVO> getTakesLike(String username,String value);
    @Select("select count(*) from takes where userName = #{searchString}")
    int getSearchPageNumber(String searchString);

    @Update("update course3.takes set grade = #{grade} and gpa = #{gpa} where semester = #{semester} and year = #{year} and teacherUserName = #{teacherUserName} and userName = #{userName} and courseId = #{courseId}")
    int update(Takes takes);

    int delete(Takes takes);

    GpaVO getGPA(String userName, String from, String to);

    List<TakesCourseVO> getGPADetails(String userName, String from, String to);
}
