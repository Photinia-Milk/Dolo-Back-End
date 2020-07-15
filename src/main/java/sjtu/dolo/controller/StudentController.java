package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.service.StudentService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/course_valid")
    @ResponseBody
    public List<Map<String, Object>> getCourseValid(JSONObject data) {
        int startIdx = data.getInt("startIndex");
        int pageSize = data.getInt("pageSize");
        return studentService.findSectionValid(startIdx, pageSize);
    }

    @RequestMapping("/course_search")
    @ResponseBody
    public List<Map<String, Object>> searchCourse(JSONObject data) {
        int startIdx = data.getInt("startIndex");
        int pageSize = data.getInt("pageSize");
        String searchString = data.getString("searchString");
        return studentService.findSection(searchString, startIdx, pageSize);
    }

    @RequestMapping("/course_select")
    @ResponseBody
    public int selectCourse(JSONObject data) {
        return studentService.addCourseTakes(data);
    }

    @RequestMapping("/course_drop")
    @ResponseBody
    public int dropCourse(JSONObject data) {
        return studentService.delCourseTakes(data);
    }

    @RequestMapping("/course_list")
    @ResponseBody
    public List<Map<String, Object>> getCourseList(@RequestParam("user_name") String user_name) {
        return studentService.findTakeList(user_name);
    }
}
