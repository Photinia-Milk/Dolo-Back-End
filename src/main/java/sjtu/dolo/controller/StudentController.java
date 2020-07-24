package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.model.*;
import sjtu.dolo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/course_valid")
    @ResponseBody
    public List<Course> getCourseValid(
            @RequestParam("startIndex") int startIdx,
            @RequestParam("pageSize") int pageSize) {

        return studentService.findCourseValid(startIdx, pageSize);
    }

    @GetMapping("/section_valid")
    @ResponseBody
    public List<Section> getSectionValid(@RequestParam("courseId") String courseId){
        return studentService.findSectionValid(courseId);
    }

    @GetMapping("/course_search")
    @ResponseBody
    public List<Course> searchCourse(
            @RequestParam("startIndex") int startIdx,
            @RequestParam("pageSize") int pageSize,
            @RequestParam("key") String searchString) {

        return studentService.findCourse(searchString, startIdx, pageSize);
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
    public List<TakesCourseStudentVO> getCourseList(@RequestParam("user_name") String user_name) {
        return studentService.findTakeList(user_name);
    }
}
