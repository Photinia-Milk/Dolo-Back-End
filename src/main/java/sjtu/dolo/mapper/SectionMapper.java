package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.Section;

import java.util.List;

@Mapper
public interface SectionMapper extends BaseMapper<Section> {
//    List<Section> findSectionByLimit(Map<String,Integer> map);
//    List<Section> findSectionLike(String value);
//
//    @Select("select * from (section natural join course natural join timeslot) where coursename like #{value} limit #{map.startIndex},#{map.pageSize}" )
//    List<SectionCourseTimeSlotVO> getSectionLike(String value, Map<String,Integer> map);
//
//    @Select("select * from (section natural join course natural join timeslot) limit #{map.startIndex},#{map.pageSize}")
//    List<SectionCourseTimeSlotVO> getSectionByLimit(Map<String,Integer> map);

//    int update(Section section);
      List<Section> findSectionByCourseId(String courseId);
}
