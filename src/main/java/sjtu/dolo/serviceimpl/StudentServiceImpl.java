package sjtu.dolo.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.StudentMapper;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;
import sjtu.dolo.service.StudentService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    private TakesMapper takesMapper;
    private SectionMapper sectionMapper;

    @Override
    public List<Section> findSectionValid() {
        return studentMapper.getAllSection();
    }

    @Override
    public List<Section> findSection(String searchString) {
        return null;
    }

    @Override
    public int addCourseTakes(JSONObject data) {
        QueryWrapper<Section> sectionWrapper = new QueryWrapper<>();
        String secID = data.getString("secID");
        String user_name = data.getString("user_name");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String timeslotID = data.getString("timeslotID");
        String courseID = data.getString("courseID");
        String building = data.getString("building");
        String roomnumber = data.getString("roomnumber");
        BigDecimal credits = new BigDecimal(data.get("credits").toString());
        String weeks = data.getString("weeks");
        int maxnum = data.getInt("maxnum");
        int currentnum = data.getInt("currentnum");
        Takes takes = new Takes(secID, semester, year, timeslotID, user_name, courseID, null,null);
        Section newSection = new Section(secID, semester, year, timeslotID, courseID, building, roomnumber, credits, weeks, maxnum, currentnum);

        sectionWrapper
                .eq("secID", secID)
                .eq("semester",semester)
                .eq("year",year)
                .eq("timelotID",timeslotID)
                .eq("courseID", courseID);
        int takesStatus = takesMapper.insert(takes);
        int sectionStatus = sectionMapper.update(newSection,sectionWrapper);

        int result = 0;
        if(takesStatus > 0 && sectionStatus > 0){
            return result;
        }else if(takesStatus > 0 && sectionStatus == 0){
            result = 1;
            return result;
        }else {
            result = 2;
            return result;
        }
    }

    @Override
    public int delCourseTakes(JSONObject data) {
        QueryWrapper<Section> sectionWrapper = new QueryWrapper<>();
        QueryWrapper<Takes> takesQueryWrapper = new QueryWrapper<>();
        String secID = data.getString("secID");
        String user_name = data.getString("user_name");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String timeslotID = data.getString("timeslotID");
        String courseID = data.getString("courseID");
        String building = data.getString("building");
        String roomnumber = data.getString("roomnumber");
        BigDecimal credits = new BigDecimal(data.get("credits").toString());
        String weeks = data.getString("weeks");
        int maxnum = data.getInt("maxnum");
        int currentnum = data.getInt("currentnum");
        Section newSection = new Section(secID, semester, year, timeslotID, courseID, building, roomnumber, credits, weeks, maxnum, currentnum);

        sectionWrapper
                .eq("secID", secID)
                .eq("semester",semester)
                .eq("year",year)
                .eq("timelotID",timeslotID)
                .eq("courseID", courseID);

        takesQueryWrapper
                .eq("secID", secID)
                .eq("semester", semester)
                .eq("year", year)
                .eq("timeslotID", timeslotID)
                .eq("user_name", user_name)
                .eq("courseID",courseID);
        int takesStatus = takesMapper.delete(takesQueryWrapper);
        int sectionStatus = sectionMapper.update(newSection,sectionWrapper);
        int result = 0;
        if(takesStatus > 0 && sectionStatus > 0){
            return result;
        }else if(takesStatus > 0 && sectionStatus == 0){
            result = 1;
            return result;
        }else {
            result = 2;
            return result;
        }
    }

    @Override
    public List<Takes> findTakeList(String studentID) {
        return studentMapper.getAllTakes(studentID);
    }


}
