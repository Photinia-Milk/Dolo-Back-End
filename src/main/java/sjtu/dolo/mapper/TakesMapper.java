package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.TakesCourseStudentVO;

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

    int delete(Takes takes);
}
