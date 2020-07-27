package sjtu.dolo.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sjtu.dolo.service.CourseService;

@RequestMapping("api")
@RestController
public class CourseController {
    @Autowired
    CourseService courseService;


}
