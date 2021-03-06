package sjtu.dolo.serviceimpl;

import net.sf.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import sjtu.dolo.mapper.CourseMapper;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.model.Course;
import sjtu.dolo.model.GpaVO;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.service.StudentService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentServiceImplTest {

    @Test
    public void contextLoads() {}

    @TestConfiguration
    static class StudentServiceImplyTestContextConfiguration{
        @Bean
        public StudentService studentService() {
            return new StudentServiceImpl();
        }
    }

    @Autowired
    private StudentService studentService;

    @MockBean
    private CourseMapper courseMapper;

    @MockBean
    private SectionMapper sectionMapper;

    @MockBean
    private TakesMapper takesMapper;

    @BeforeEach
    public void setUp() {
        String addUserName = "student1";
        String addCourseId = "AD003";
        String addTeacherUserName = "teacher131";
        String addSemester = "2020-2021-1";
        String addYear = "2020-2021";

        int currectStatus = studentService.addCourseTakes(addUserName,addSemester,addYear,addCourseId,addTeacherUserName);
        if(currectStatus == 0) {
            System.out.println("\nsuccessfully init data\n");
        } else {
            System.out.println("\ndata init failed\n");
        }
    }

    @AfterEach
    public void tearDown() {
        String delUserName = "student2";
        String delCourseId = "AV012";
        String delTeacherUserName = "teacher266";
        String delSemester = "2020-2021-1";
        String delYear = "2020-2021";
        String delInitUserName = "student1";
        String delInitCourseId = "AV012";
        String delInitTeacherUserName = "teacher131";
        String delInitSemester = "2020-2021-1";
        String delInitYear = "2020-2021";


        int delStatus = studentService.delCourseTakes(delUserName,delSemester,delYear,delCourseId,delTeacherUserName);
        int delInitStatus = studentService.delCourseTakes(delInitUserName,delInitSemester,delInitYear,delInitCourseId,delInitTeacherUserName);
        if(delStatus == 0) {
            System.out.println("\nsuccessfully clear data\n");
        } else {
            System.out.println("\ndata clear failed\n");
        }
        if(delStatus == 0) {
            System.out.println("\nsuccessfully delete init data\n");
        } else {
            System.out.println("\ninit data has been deleted\n");
        }
    }

    @Test
    public void findCourseValid() {
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 3);
        List<Course> itemList;
//        int pageNum;

        List<Course> returnList = new LinkedList<>();
        BigDecimal big2 = BigDecimal.valueOf(2.0);
        returnList.add(new Course("AD003","","设计素描","通选",2.0));
        returnList.add(new Course("AI007",null,"人工智能","通选",2.0));
        returnList.add(new Course("AM001","","管理基础","通选",2.0));
        int returnPageNum = 258;
//        Map<Integer, List<Course>> returnMap = new HashMap<>();
//        returnMap.put(returnPageNum, returnList);

        when(courseMapper.getCourse(map)).thenReturn(returnList);
        when(courseMapper.getPageNumber()).thenReturn(returnPageNum);
//        assertEquals(returnPageNum, studentService.findCourseValid(1,10).get(""));4

        // 稍耦合，判断课号相等
        for(int i = 0; i < returnList.size(); i++) {
            assertEquals(returnList.get(i).getCourseId(), studentService.findCourseValid(1,3).getCourseList().get(i).getCourseId());
        }
    }

    @Test
    public void findCourse() {
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 2);
        map.put("pageSize", 3);
        List<Course> itemList;
        int pageNum;
        String searchString = "与";

        List<Course> returnList = new LinkedList<>();
        BigDecimal big2 = BigDecimal.valueOf(2.0);
        BigDecimal big3 = BigDecimal.valueOf(3.0);
        returnList.add(new Course("AM314","","沟通技巧与领导力开发","通选",2.0));
        returnList.add(new Course("AR904","人文学科","图像遗产与中国古代艺术","通识核心课程",2.0));
        returnList.add(new Course("AR909","人文学科","书法与中国美学","通识核心课程",2.0));
        int returnPageNum = 109;
//        Map<Integer, List<Course>> returnMap = new HashMap<>();
//        returnMap.put(returnPageNum, returnList);

        when(courseMapper.getCourseLike(map,searchString)).thenReturn(returnList);
        when(courseMapper.getSearchPageNumber(searchString)).thenReturn(returnPageNum);

        // 稍耦合，判断课号相等
        for(int i = 0; i < returnList.size(); i++) {
            assertEquals(returnList.get(i).getCourseId(), studentService.findCourse(searchString,2,3).getCourseList().get(i).getCourseId());
        }
    }

    @Test
    public void findSectionValid() {
        String courseId = "SE125";
//        List<Section> sectionList = new LinkedList<>();

        List<Section> returnList = new LinkedList<>();
        returnList.add(new Section("2020-2021-1","2020-2021","SE125","teacher235","星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1));
        returnList.add(new Section("2020-2021-1","2020-2021","SE125","teacher236","星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,0));

        when(sectionMapper.findSectionByCourseId(courseId)).thenReturn(returnList);

        // 稍耦合，判断课号相等
        for(int i = 0; i < returnList.size(); i++) {
            assertEquals(returnList.get(i).getCourseId(), studentService.findSectionValid(courseId).get(i).getCourseId());
        }
    }

    @Test
    public void addCourseTakes() {
        String correctUserName = "student66";
        String correctSemester = "2020-2021-1";
        String correctYear = "2020-2021";
        String correctCourseId = "AM008";
        String correctTeacherUserName = "teacher133";
        //String errTeacherUserName = "teacher264";
        int correctStatus = 1;
        //int errStatus = 1;

        assertEquals(correctStatus, studentService.addCourseTakes(correctUserName,correctSemester,correctYear,correctCourseId,correctTeacherUserName));
       // assertEquals(errStatus, studentService.addCourseTakes(correctUserName,correctSemester,correctYear,correctCourseId,errTeacherUserName));
    }

    @Test
    public void delCourseTakes() {
        String currectUserName = "student1";
        String currectSemester = "2020-2021-1";
        String currectYear = "2020-2021";
        String currectCourseId = "AD003";
        String currectTeacherUserName = "teacher131";
        String errCourseId = "AV012";
        String errTeacherUserName = "teacher266";

        int currectStatus = 0;
        int errStatus = 1;

        assertEquals(currectStatus, studentService.delCourseTakes(currectUserName,currectSemester,currectYear,currectCourseId,currectTeacherUserName));
        assertEquals(errStatus, studentService.delCourseTakes(currectUserName,currectSemester,currectYear,errCourseId,errTeacherUserName));
    }

    @Test
    public void findTakeList() {
        String userName = "student66";
//        int takesNum;
        List<TakesCourseStudentVO> takeList = new LinkedList<>();
        takeList.add(new TakesCourseStudentVO("软件工程原理与实践","必修",null,3.0,"2020-2021-1","2020-2021","SE123","student66",88.0,3.65,"teacher232","星期一第3-4节{1-16周}\\n星期三第1-2节{1-15周(单)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"25","1-15周(单)","星期三",1,2));
        takeList.add(new TakesCourseStudentVO("软件工程原理与实践","必修",null,3.0,"2020-2021-1","2020-2021","SE123","student66",88.0,3.65,"teacher232","星期一第3-4节{1-16周}\\n星期三第1-2节{1-15周(单)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"26","1-16周","星期一",3,4));
        takeList.add(new TakesCourseStudentVO("计算机系统工程","必修",null,4.0,"2020-2021-1","2020-2021","SE124","student66",94.0,4.00,"teacher234","星期二第3-4节{1-16周}\\n星期四第3-4节{1-16周}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"27","1-16周","星期二",3,4));
        takeList.add(new TakesCourseStudentVO("计算机系统工程","必修",null,4.0,"2020-2021-1","2020-2021","SE124","student66",94.0,4.00,"teacher234","星期二第3-4节{1-16周}\\n星期四第3-4节{1-16周}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"28","1-16周","星期四",3,4));
        takeList.add(new TakesCourseStudentVO("机器学习","必修",null,3.0,"2020-2021-1","2020-2021","SE125","student66",99.0,4.30,"teacher235","星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"29","1-16周","星期三",3,4));
        takeList.add(new TakesCourseStudentVO("机器学习","必修",null,3.0,"2020-2021-1","2020-2021","SE125","student66",99.0,4.30,"teacher235","星期三第3-4节{1-16周}\\n星期五第3-4节{2-16周(双)}","东上院411","仅限软件工程专业学生选课","面讲授课",180,1,"30","2-16周(双)","星期五",3,4));
        takeList.add(new TakesCourseStudentVO("编译原理与技术","限选",null,3.0,"2020-2021-1","2020-2021","SE302","student66",82.0,3.30,"teacher237","星期二第1-2节{1-12周}\\n星期四第9-10节{1-12周}","东上院411","系统软件方向必修课，仅限软件工程专业学生选课","面讲授课",120,1,"10","1-12周","星期四",9,10));
        takeList.add(new TakesCourseStudentVO("编译原理与技术","限选",null,3.0,"2020-2021-1","2020-2021","SE302","student66",82.0,3.30,"teacher237","星期二第1-2节{1-12周}\\n星期四第9-10节{1-12周}","东上院411","系统软件方向必修课，仅限软件工程专业学生选课","面讲授课",120,1,"31","1-12周","星期二",1,2));

        int returnNum = 4;
        when(takesMapper.getTakes(userName)).thenReturn(takeList);

        // 稍耦合，判断课号相等
        for(int i = 0; i < takeList.size(); i++) {
            assertEquals(takeList.get(i).getCourseId(), studentService.findTakeList(userName).get(i).getCourseId());
        }
    }

    @Test
    public void getGPA(){
        String userName = "student66";
        String  from = "2020-2021-1";
        String to = "2020-2021-1";
        String type = "";

        GpaVO gpaVO = studentService.getGPA(userName, from, to, type);
        GpaVO gpaVO1 = studentService.getGPA(userName, "1998-1999-2", "2000-2021-2", "okay");

        // 断言可取出结果
        assert gpaVO != null;
        // 断言无结果
        assert gpaVO1 == null;
    }

}
