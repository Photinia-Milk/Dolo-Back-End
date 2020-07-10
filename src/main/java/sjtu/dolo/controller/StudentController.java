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

    @RequestMapping("/course_to_select")
    @ResponseBody
    public List<Section> getCourseToSelect() {
        return studentService.findSectionValid();
    }

    @RequestMapping("/course_select")
    @ResponseBody
    public String selectCourse(JSONObject data) {
        return studentService.addCourseTakes(data);
    }

    @RequestMapping("/course_drop")
    @ResponseBody
    public String dropCourse(JSONObject data) {
        return studentService.delCourseTakes(data);
    }

    @RequestMapping("/course_list")
    @ResponseBody
    public List<Takes> getCourseList(@RequestParam("studentID") String studentID) {
        return studentService.findTakeList(studentID);
    }
}
