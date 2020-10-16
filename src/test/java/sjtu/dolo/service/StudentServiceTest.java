//package sjtu.dolo.service;
//
//import net.sf.json.JSONObject;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import org.springframework.transaction.annotation.Transactional;
//import sjtu.dolo.CourseApplicationTests;
//import sjtu.dolo.mapper.SectionMapper;
//import sjtu.dolo.mapper.TakesMapper;
//import sjtu.dolo.model.SectionCourseVO;
//import sjtu.dolo.model.TakesCourseStudentVO;
//import sjtu.dolo.serviceimpl.StudentServiceImpl;
//
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;
//
//@Transactional
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class StudentServiceTest extends CourseApplicationTests {
//    @Test
//    public void contextLoads() {
//
//    }
//
//    @TestConfiguration
//    static class StudentServiceImplyTestContextConfiguration{
//        @Bean
//        public StudentService studentService() {
//            return new StudentServiceImpl();
//        }
//    }
////    @Test
////    public void contextLoads() {
////
////    }
//
//    @Autowired
//    private StudentService studentService;
//
//    @MockBean
//    private SectionMapper sectionMapper;
//
//    @MockBean
//    private TakesMapper takesMapper;
//
////    @BeforeEach
////    @Test
////    public void addTakes() {
////        JSONObject data = new JSONObject();
//////        data.put("secID", "1");
//////        data.put("user_name", "amadeus");
//////        data.put("semester", "2");
//////        data.put("year", "2019");
//////        data.put("timeslotID", "1");
//////        data.put("courseID", "1");
//////        data.put("building", "东上院");
//////        data.put("roomnumber", "202");
//////        data.put("credits", 3.0);
//////        data.put("weeks", "第一周到第十六周");
//////        data.put("maxnum", 120);
//////        data.put("currentnum", 2);
//////        data.put("");
////        int status = studentService.addCourseTakes(data);
////        System.out.println(status);
////    }
//
//    @Test
//    public void findSectionValid(){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("startIndex", 0);
//        map.put("pageSize", 2);
//        List<SectionCourseVO> vo = new LinkedList<>();
////        BigDecimal big = BigDecimal.valueOf(3.0);
////        String startime = "08:00:00";
////        String endtime = "09:50:00";
////        String startime2 = "10:00:00";
////        String endtime2 = "11:50:00";
////        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
////        java.util.Date start = null;
////        java.util.Date end = null;
////        java.util.Date start2 = null;
////        java.util.Date end2 = null;
////        try {
////            start = format.parse(startime);
////            end = format.parse(endtime);
////            start2 = format.parse(startime2);
////            end2 = format.parse(endtime2);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        java.sql.Time startTime = new java.sql.Time(start.getTime());
////        java.sql.Time endTime = new java.sql.Time(end.getTime());
////        java.sql.Time startTime2 = new java.sql.Time(start2.getTime());
////        java.sql.Time endTime2 = new java.sql.Time(end2.getTime());
//        vo.add(new SectionCourseVO("1","2","2019","1","1","东上院","202",big,"第一周到第十六周",120,2,"1","ICS","必修","星期一",startTime,endTime));
//        vo.add(new SectionCourseVO("1","2","2019","6","1","东上院","202",big,"第一周到第十六周",120,1,"1","ICS","必修","星期二",startTime2,endTime2));
////        vo.add(new SectionCourseTimeSlotVO("1","1","2019","6","1","东上院","202",big,"第一周到第十六周",120,1,"1","ICS","Tuesday",startTime,endTime));
//        when(sectionMapper.getSectionByLimit(map)).thenReturn(vo);
//        for(int i = 0; i < vo.size(); i++){
//            assertEquals(vo.get(i), studentService.findSectionValid(0,2).get(i));
//        }
////        assertEquals(vo., studentService.findSectionValid(0,2));
//        assertEquals(2, studentService.findSectionValid(0,2).size());
//    }
//
//    @Test
//    public void findSection(){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("startIndex", 0);
//        map.put("pageSize", 2);
//
//        String search = "I";
//
//        List<SectionCourseVO> vo = new LinkedList<>();
//        BigDecimal big = BigDecimal.valueOf(3.0);
//        String startime = "08:00:00";
//        String endtime = "09:50:00";
//        String startime2 = "10:00:00";
//        String endtime2 = "11:50:00";
//        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//        java.util.Date start = null;
//        java.util.Date end = null;
//        java.util.Date start2 = null;
//        java.util.Date end2 = null;
//        try {
//            start = format.parse(startime);
//            end = format.parse(endtime);
//            start2 = format.parse(startime2);
//            end2 = format.parse(endtime2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        java.sql.Time startTime = new java.sql.Time(start.getTime());
//        java.sql.Time endTime = new java.sql.Time(end.getTime());
//        java.sql.Time startTime2 = new java.sql.Time(start2.getTime());
//        java.sql.Time endTime2 = new java.sql.Time(end2.getTime());
//
//        vo.add(new SectionCourseVO("1","2","2019","1","1","东上院","202",big,"第一周到第十六周",120,2,"1","ICS","必修","星期一",startTime,endTime));
//        vo.add(new SectionCourseVO("1","2","2019","6","1","东上院","202",big,"第一周到第十六周",120,1,"1","ICS","必修","星期二",startTime2,endTime2));
//
//        when(sectionMapper.getSectionLike(search, map)).thenReturn(vo);
////        assertEquals(vo, studentService.findSectionValid(0,2));
//        for(int i = 0; i < vo.size(); i++){
//            assertEquals(vo.get(i), studentService.findSection("I",0,2).get(i));
//        }
//        assertEquals(2, studentService.findSection("I",0,2).size());
//    }
//
//    @Test
//    public void findTakeList() {
//        String name = "amadeus";
//        List<TakesCourseStudentVO> vo = new LinkedList<>();
////        vo.add(new TakesCourseStudentVO("2","2","2019","2","3","amadeus",null,null,"1","Computer Science","必修","Xingyu",null,null, (short) 0,null,null,null,null,null));
//        vo.add(new TakesCourseStudentVO("1","2","2019","1","1","amadeus",null,null,"1","ICS","必修","Xingyu",null,null, (short) 0,null,null,null,null,null));
////        when(takesMapper.getTakes(name)).thenReturn(vo);
////        System.out.println(studentService.findTakeList(name));
//        for(int i = 0; i < vo.size(); i++){
//            assertEquals(vo.get(i), studentService.findTakeList(name).get(i));
//        }
////        assertEquals(vo, studentService.findTakeList(name));
//    }
//
//    @Test
//    public void addCourseTakes() {
//        JSONObject data = new JSONObject();
//        JSONObject wrongData = new JSONObject();
//        data.put("secID", "1");
//        data.put("user_name", "amadeus");
//        data.put("semester", "2");
//        data.put("year", "2019");
//        data.put("timeslotID", "1");
//        data.put("courseID", "1");
//        data.put("building", "东上院");
//        data.put("roomnumber", "202");
//        data.put("credits", 3.0);
//        data.put("weeks", "第一周到第十六周");
//        data.put("maxnum", 120);
//        data.put("currentnum", 2);
//        wrongData.put("secID", "1");
//        wrongData.put("user_name", "iamanidiot");
//        wrongData.put("semester", "2");
//        wrongData.put("year", "2019");
//        wrongData.put("timeslotID", "1");
//        wrongData.put("courseID", "1");
//        wrongData.put("building", "东上院");
//        wrongData.put("roomnumber", "202");
//        wrongData.put("credits", 3.0);
//        wrongData.put("weeks", "第一周到第十六周");
//        wrongData.put("maxnum", 120);
//        wrongData.put("currentnum", 2);
//        int status = 0;
//        int errorStatus = 1;
//        assertEquals(status, studentService.addCourseTakes(data));
//        assertEquals(errorStatus, studentService.addCourseTakes(wrongData));
//    }
//
//    @AfterEach
//    @Test
//    public void delTakes() {
//        JSONObject data = new JSONObject();
//        data.put("secID", "1");
//        data.put("user_name", "amadeus");
//        data.put("semester", "2");
//        data.put("year", "2019");
//        data.put("timeslotID", "1");
//        data.put("courseID", "1");
//        data.put("building", "东上院");
//        data.put("roomnumber", "202");
//        data.put("credits", 3.0);
//        data.put("weeks", "第一周到第十六周");
//        data.put("maxnum", 120);
//        data.put("currentnum", 2);
//        int status = 0;
//        assertEquals(status, studentService.delCourseTakes(data));
//    }
//
//    @Test
//    public void delCourseTakes() {
//        JSONObject data = new JSONObject();
//        JSONObject wrongData = new JSONObject();
//
////        data.put("secID", "2");
////        data.put("user_name", "amadeus");
////        data.put("semester", "2");
////        data.put("year", "2019");
////        data.put("timeslotID", "2");
////        data.put("courseID", "3");
////        data.put("building", "东上院");
////        data.put("roomnumber", "109");
////        data.put("credits", 3.0);
////        data.put("weeks", "第一周到第十六周");
////        data.put("maxnum", 60);
////        data.put("currentnum", 0);
//        data.put("secID", "1");
//        data.put("user_name", "amadeus");
//        data.put("semester", "2");
//        data.put("year", "2019");
//        data.put("timeslotID", "1");
//        data.put("courseID", "1");
//        data.put("building", "东上院");
//        data.put("roomnumber", "202");
//        data.put("credits", 3.0);
//        data.put("weeks", "第一周到第十六周");
//        data.put("maxnum", 120);
//        data.put("currentnum", 1);
//        wrongData.put("secID", "100");
//        wrongData.put("user_name", "iamanidiot");
//        wrongData.put("semester", "2");
//        wrongData.put("year", "2019");
//        wrongData.put("timeslotID", "1");
//        wrongData.put("courseID", "1");
//        wrongData.put("building", "东上院");
//        wrongData.put("roomnumber", "202");
//        wrongData.put("credits", 3.0);
//        wrongData.put("weeks", "第一周到第十六周");
//        wrongData.put("maxnum", 120);
//        wrongData.put("currentnum", 2);
//        int status = 0;
//        int errStatus1 = 1;
//
////        QueryWrapper<Takes> takesQueryWrapper = new QueryWrapper<>();
////        takesQueryWrapper
////                .eq("secID", "2")
////                .eq("semester", "2")
////                .eq("year", "2019")
////                .eq("timeslotID", "2")
////                .eq("user_name", "amadeus")
////                .eq("courseID", "3");
////        Takes takes = new Takes("1", "2", "2019", "1", "1", "amadeus", null, null);
////        BigDecimal big = BigDecimal.valueOf(3.0);
////        Section section = new Section("1", "2", "2019", "1", "1", "东上院", "202", big, "第一周到第十六周", 120, 2);
//        assertEquals(status, studentService.delCourseTakes(data));
//        assertEquals(errStatus1, studentService.delCourseTakes(wrongData));
//    }
//}
