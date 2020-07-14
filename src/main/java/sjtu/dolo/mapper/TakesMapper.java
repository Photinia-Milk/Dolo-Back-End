package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.Takes;

import java.util.List;
import java.util.Map;

@Mapper
public interface TakesMapper extends BaseMapper<Takes> {
    List<Takes> getTakesByLimit(Map<String,Integer> map);
    List<Takes> getTakesLike();
}
