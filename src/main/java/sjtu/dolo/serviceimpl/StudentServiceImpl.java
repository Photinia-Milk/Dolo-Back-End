package sjtu.dolo.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.StudentMapper;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.model.Section;
import sjtu.dolo.model.SectionCourseVO;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.TakesCourseStudentVO;
import sjtu.dolo.service.StudentService;
import sjtu.dolo.utils.MybatisUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private TakesMapper takesMapper;

    @Resource
    private SectionMapper sectionMapper;



//    @Override
//    public List<Map<String, Object>> findSectionValid(Integer startIdx, Integer pageSize) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("startIndex", startIdx);
//        map.put("pageSize", pageSize);
//        return sectionMapper.getSectionByLimit(map);
//    }

//    @Override
//    public List<Map<String, Object>> findSection(String searchString, Integer startIdx, Integer pageSize) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("startIndex", startIdx);
//        map.put("page", pageSize);
//        return sectionMapper.getSectionLike(searchString, map);
//    }

    @Override
    public List<SectionCourseVO> findSectionValid(Integer startIdx, Integer pageSize) {

        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);

//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        List<SectionCourseVO> itemList;
//        itemList = sMapper.getSectionByLimit(map);
//        sqlSession.commit();
//        sqlSession.close();
        itemList = sectionMapper.getSectionByLimit(map);

        return itemList;
    }

    @Override
    public List<SectionCourseVO> findSection(String searchString, Integer startIdx, Integer pageSize) {
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);
        System.out.println(map);
        List<SectionCourseVO> itemList;
        String search = "%"+searchString+"%";

//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
//        itemList = sMapper.getSectionLike(search, map);
//        sqlSession.commit();
//        sqlSession.close();
//        System.out.println(itemList);
        itemList = sectionMapper.getSectionLike(search, map);
        return itemList;
    }

    @Override
    public int addCourseTakes(JSONObject data) {
        QueryWrapper<Section> sectionWrapper = new QueryWrapper<>();
        String secID = data.getString("secID");
        String user_name = data.getString("user_name");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String timeslotID = data.getString("timeslotID");
        String courseID = data.getString("courseID");
        String building = data.getString("building");
        String roomnumber = data.getString("roomnumber");
        BigDecimal credits = new BigDecimal(data.get("credits").toString());
        String weeks = data.getString("weeks");
        int maxnum = data.getInt("maxnum");
        int currentnum = data.getInt("currentnum");
        Takes takes = new Takes(secID, semester, year, timeslotID,  courseID, user_name, null ,null);
        Section newSection = new Section(secID, semester, year, timeslotID, courseID, building, roomnumber, credits, weeks, maxnum, currentnum);

//        sectionWrapper
//                .eq("secID", secID)
//                .eq("semester",semester)
//                .eq("year",year)
//                .eq("timelotID",timeslotID)
//                .eq("courseID", courseID);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper tMapper = sqlSession.getMapper(StudentMapper.class);
        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        int result = 0;
        try {
            int takesStatus = tMapper.addTakes(takes);
            sqlSession.commit();
        }catch (Exception e){
            result = 1;
            sqlSession.rollback();
        }
        if(result == 0){    // 若插入成功
            int sectionStatus = sMapper.update(newSection);
            sqlSession.commit();
        }
        sqlSession.close();
        return result;
//        int takesStatus = tMapper.addTakes(takes);
//        System.out.println(takesStatus);
//        int sectionStatus = sMapper.update(newSection);
//        System.out.println(sectionStatus);
//        sqlSession.commit();
//        sqlSession.close();

//        int result = 0;
//        if(takesStatus > 0 && sectionStatus > 0){
//            return result;
//        }else if(takesStatus > 0 && sectionStatus == 0){
//            result = 1;
//            return result;
//        }else {
//            result = 2;
//            return result;
//        }
    }

    @Override
    public int delCourseTakes(JSONObject data) {
        QueryWrapper<Section> sectionWrapper = new QueryWrapper<>();
        QueryWrapper<Takes> takesQueryWrapper = new QueryWrapper<>();
        String secID = data.getString("secID");
        String user_name = data.getString("user_name");
        String semester = data.getString("semester");
        String year = data.getString("year");
        String timeslotID = data.getString("timeslotID");
        String courseID = data.getString("courseID");
        String building = data.getString("building");
        String roomnumber = data.getString("roomnumber");
        BigDecimal credits = new BigDecimal(data.get("credits").toString());
        String weeks = data.getString("weeks");
        int maxnum = data.getInt("maxnum");
        int currentnum = data.getInt("currentnum");
        Takes takes = new Takes(secID, semester, year, timeslotID,  courseID, user_name, null ,null);
        Section newSection = new Section(secID, semester, year, timeslotID, courseID, building, roomnumber, credits, weeks, maxnum, currentnum);

//        sectionWrapper
//                .eq("secID", secID)
//                .eq("semester",semester)
//                .eq("year",year)
//                .eq("timelotID",timeslotID)
//                .eq("courseID", courseID);
//
//        takesQueryWrapper
//                .eq("secID", secID)
//                .eq("semester", semester)
//                .eq("year", year)
//                .eq("timeslotID", timeslotID)
//                .eq("user_name", user_name)
//                .eq("courseID",courseID);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper tMapper = sqlSession.getMapper(StudentMapper.class);
        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        int result = 1;
        int takesStatus = 0;
        try {
            takesStatus = tMapper.delTakes(takes);
            System.out.println("rows changed:" + takesStatus);
            sqlSession.commit();
        }catch (Exception e){
            result = 2;
            sqlSession.rollback();
        }
        if(takesStatus != 0){    // 若删除成功
            int sectionStatus = sMapper.update(newSection);
            sqlSession.commit();
            result = 0;
        }
        sqlSession.close();
        return result;
//        int takesStatus = tMapper.delTakes(takes);
//        int sectionStatus = sMapper.update(newSection);
//        sqlSession.commit();
//        sqlSession.close();
//
//        int result = 0;
//        if(takesStatus > 0 && sectionStatus > 0){
//            return result;
//        }else if(takesStatus > 0 && sectionStatus == 0){
//            result = 1;
//            return result;
//        }else {
//            result = 2;
//            return result;
//        }
    }

    @Override
    public List<TakesCourseStudentVO> findTakeList(String user_name) {
//        return studentMapper.getAllTakes(user_name);
//        QueryWrapper<Takes> takesQueryWrapper = new QueryWrapper<>();
//        takesQueryWrapper
//                .eq("user_name", user_name);
//        return takesMapper.selectList(takesQueryWrapper);
//        return takesMapper.getTakes(user_name);
//
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TakesMapper takesMapper = sqlSession.getMapper(TakesMapper.class);
        List<TakesCourseStudentVO> itemList;
        itemList = takesMapper.getTakes(user_name);
        sqlSession.commit();
        sqlSession.close();
         return itemList;
    }


}
