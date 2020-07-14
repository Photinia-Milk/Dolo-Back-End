package sjtu.dolo.serviceimpl;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.StudentMapper;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;
import sjtu.dolo.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Section> findSectionValid() {
        return studentMapper.getAllSection();
    }

    @Override
    public String addCourseTakes(JSONObject data) {
            String secID = data.getString("secID");
            String studentID = data.getString("studentID");
            String semester = data.getString("semester");
            String year = data.getString("year");
            String timeslotID = data.getString("timeslotID");
            String courseID = data.getString("courseID");
            Takes takes = new Takes(secID, semester, year, timeslotID, studentID, courseID, null,null);
            String status = studentMapper.addTakes(takes);
            return status;
    }

    @Override
    public String delCourseTakes(JSONObject data) {
        String secID = data.getString("secID");
        String studentID = data.getString("studentID");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String timeslotID = data.getString("timeslotID");
        String courseID = data.getString("courseID");
        Takes takes = new Takes(secID, semester, year, timeslotID, studentID, courseID, null,null);
        String status = studentMapper.delTakes(takes);
        return null;
    }

    @Override
    public List<Takes> findTakeList(String studentID) {
        return studentMapper.getAllTakes(studentID);
    }


}
