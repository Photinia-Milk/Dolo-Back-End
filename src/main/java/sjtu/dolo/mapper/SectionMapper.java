package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.Section;

import java.util.List;
import java.util.Map;

@Mapper
public interface SectionMapper extends BaseMapper<Section> {
    List<Section> getSectionByLimit(Map<String,Integer> map);
    List<Section> getSectionLike(String value);
}
