package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.model.*;
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
    public CourseNumListVO getCourseValid(
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
    public CourseNumListVO searchCourse(
            @RequestParam("startIndex") int startIdx,
            @RequestParam("pageSize") int pageSize,
            @RequestParam("key") String searchString) {

        return studentService.findCourse(searchString, startIdx, pageSize);
    }

    @PostMapping("/course_select")
    @ResponseBody
    public int selectCourse(@RequestBody JSONObject data) {
        String userName = data.getString("userName");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String courseId = data.getString("courseId");
        String teacherUserName = data.getString("teacherUserName");
        return studentService.addCourseTakes(userName,semester,year,courseId,teacherUserName);
    }

    @PostMapping("/course_drop")
    @ResponseBody
    public int dropCourse(@RequestBody JSONObject data) {
        String userName = data.getString("userName");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String courseId = data.getString("courseId");
        String teacherUserName = data.getString("teacherUserName");
        return studentService.delCourseTakes(userName,semester,year,courseId,teacherUserName);
    }

    @GetMapping("/course_list")
    @ResponseBody
    public List<TakesCourseStudentVO> getCourseList(@RequestParam("userName") String user_name) {
        return studentService.findTakeList(user_name);
    }

    @GetMapping("/gpa")
    @ResponseBody
    public GpaVO getGPA(@RequestParam("userName") String userName,
                             @RequestParam("from") String from,
                             @RequestParam("to") String to,
                             @RequestParam("type") String type) {
        return studentService.getGPA(userName, from, to, type);
    }
}
