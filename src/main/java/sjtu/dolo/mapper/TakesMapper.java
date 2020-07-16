package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sjtu.dolo.model.Takes;

import java.util.List;
import java.util.Map;

@Mapper
public interface TakesMapper extends BaseMapper<Takes> {

    List<Takes> findTakesByLimit(Map<String,Integer> map);
    List<Takes> findTakesLike(String value);

    int insert(Takes takes);

    @Select("select * from takes natural join course natural join student where student.user_name = #{username}")
    List<Map<String,Object>> getTakes(String username);

    @Select("select * from takes natural join course natural join student where student.user_name = #{username} limit #{startIndex},#{pageSize}")
    List<Map<String,Object>> getTakesByLimit(String username,Map<String,Integer> map);

    @Select("select * from takes natural join course natural join student where student.user_name = #{username} and coursename like #{value}")
    List<Map<String,Object>> getTakesLike(String username,String value);
}
