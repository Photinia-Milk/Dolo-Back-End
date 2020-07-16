package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.model.SectionCourseTimeSlotVO;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.service.StudentService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/course_valid")
    @ResponseBody
    public SectionCourseTimeSlotVO getCourseValid(
            @RequestParam("start_index") int startIdx,
            @RequestParam("page_size") int pageSize) {
        return studentService.findSectionValid(startIdx, pageSize);
    }



    @GetMapping("/course_search")
    @ResponseBody
    public SectionCourseTimeSlotVO searchCourse(
            @RequestParam("start_index") int startIdx,
            @RequestParam("page_size") int pageSize,
            @RequestParam("key") String searchString) {
        return studentService.findSection(searchString, startIdx, pageSize);
    }

    @PostMapping("/course_select")
    @ResponseBody
    public int selectCourse(@RequestBody JSONObject data) {
        return studentService.addCourseTakes(data);
    }

    @PostMapping("/course_drop")
    @ResponseBody
    public int dropCourse(@RequestBody JSONObject data) {
        return studentService.delCourseTakes(data);
    }

    @GetMapping("/course_list")
    @ResponseBody
    public TakesCourseStudentVO getCourseList(@RequestParam("user_name") String user_name) {
        return studentService.findTakeList(user_name);
    }
}
