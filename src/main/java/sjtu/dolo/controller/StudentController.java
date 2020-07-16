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

    @GetMapping("/course_valid")
    @ResponseBody
    public List<Map<String, Object>> getCourseValid(@RequestBody JSONObject data) {
<<<<<<< HEAD
        assert data != null;
        System.out.println("data:");
        System.out.println(data);
        Integer startIdx = data.optInt("startIndex");
        Integer pageSize = data.optInt("pageSize");
        System.out.println(startIdx);
        System.out.println(pageSize);
        return studentService.findSectionValid(startIdx, pageSize);
    }

    @RequestMapping("/course_search")
    @ResponseBody
    public List<Map<String, Object>> searchCourse(@RequestBody JSONObject data) {
//        int startIdx = data.getInt("startIndex");
        int startIdx = data.optInt("startIndex");
        int pageSize = data.optInt("pageSize");
=======

        int startIdx = data.getInt("startIndex");
        int pageSize = data.getInt("pageSize");
        return studentService.findSectionValid(startIdx, pageSize);
    }



    @GetMapping("/course_search")
    @ResponseBody
    public List<Map<String, Object>> searchCourse(@RequestBody JSONObject data) {
        int startIdx = data.getInt("startIndex");
        int pageSize = data.getInt("pageSize");
>>>>>>> cf22b3733edfc8c759337eb0ed42b2df21f523a6
        String searchString = data.getString("searchString");
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
    public List<Map<String, Object>> getCourseList(@RequestParam("user_name") String user_name) {
        return studentService.findTakeList(user_name);
    }
}
