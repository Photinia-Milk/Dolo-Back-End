package sjtu.dolo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.Teacher;

import java.math.BigDecimal;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
     int score(Takes takes);
}
