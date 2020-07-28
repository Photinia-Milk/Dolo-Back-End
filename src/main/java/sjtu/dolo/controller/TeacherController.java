package sjtu.dolo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.service.TeacherService;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/score")
    @ResponseBody
    public String score(@RequestParam("semester") String semester,
                        @RequestParam("userName") String userName,
                        @RequestParam("year") String year,
                        @RequestParam("teacherUserName") String teacherUserName,
                        @RequestParam("grade") Double grade,
                        @RequestParam("courseId") String courseId){
        return teacherService.score(userName,semester,year,courseId,teacherUserName,grade);
    }

}
