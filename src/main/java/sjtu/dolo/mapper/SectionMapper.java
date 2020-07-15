package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import sjtu.dolo.model.Section;

import java.util.List;
import java.util.Map;

@Mapper
public interface SectionMapper extends BaseMapper<Section> {
    //List<Section> getSectionByLimit(Map<String,Integer> map);
    //List<Section> getSectionLike(String value);

    @Select("select * from (section natural join course natural join timeslot) where coursename like #{value} limit #{startIndex},#{pageSize}" )
    List<Map<String,Object>> getSectionLike(String value, Map<String,Integer> map);

    @Select("select * from (section natural join course natural join timeslot) limit #{startIndex},#{pageSize}")
    List<Map<String,Object>> getSectionByLimit(Map<String,Integer> map);
}
