package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.Takes;
import sjtu.dolo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/course_valid")
    @ResponseBody
    public List<Section> getCourseValid() {
        return studentService.findSectionValid();
    }

    @RequestMapping("/course_search")
    @ResponseBody
    public List<Section> searchCourse(String searchString) {
        return studentService.findSection(searchString);
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
    public List<Takes> getCourseList(@RequestParam("user_name") String user_name) {
        return studentService.findTakeList(user_name);
    }
}
