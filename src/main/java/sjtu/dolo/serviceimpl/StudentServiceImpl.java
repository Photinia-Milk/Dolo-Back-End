package sjtu.dolo.serviceimpl;

import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.CourseMapper;
import sjtu.dolo.mapper.SecTimeMapper;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.model.*;

import sjtu.dolo.service.StudentService;
import sjtu.dolo.utils.MybatisUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private TakesMapper takesMapper;

    @Resource
    private SectionMapper sectionMapper;

    @Resource
    private CourseMapper courseMapper;

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
    public CourseNumListVO findCourseValid(Integer startIdx, Integer pageSize){
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);
        List<Course> itemList;
        int courseNum;
        courseNum = courseMapper.getPageNumber();
        itemList = courseMapper.getCourse(map);
        return new CourseNumListVO(courseNum, itemList);
    }

    @Override
    public CourseNumListVO findCourse(String searchString, Integer startIdx, Integer pageSize) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, List<Course>> returnMap = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);
        System.out.println(map);
        List<Course> itemList;
        int courseNum;
        String search = "%"+searchString+"%";

//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
//        itemList = sMapper.getSectionLike(search, map);
//        sqlSession.commit();
//        sqlSession.close();
//        System.out.println(itemList);
        courseNum = courseMapper.getSearchPageNumber(search);
        itemList = courseMapper.getCourseLike(map,search);
        returnMap.put(courseNum, itemList);
//        return itemList;
        return new CourseNumListVO(courseNum, itemList);
    }

    @Override
    public List<Section> findSectionValid(String courseId) {

//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        List<Section> itemList;
//        itemList = sMapper.getSectionByLimit(map);
//        sqlSession.commit();
//        sqlSession.close();
        itemList = sectionMapper.findSectionByCourseId(courseId);

        return itemList;
    }

    @Override
    public int addCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName) {
        Takes takes = new Takes(semester, year, courseId, userName, null ,null, teacherUserName);

        System.out.println(takes);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TakesMapper tMapper = sqlSession.getMapper(TakesMapper.class);
        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        SecTimeMapper stMapper = sqlSession.getMapper(SecTimeMapper.class);
        int result = 0;
        //检验上课时间段是否冲突
        List<SecTime> secTimes = stMapper.getSecTime(semester,year,courseId,teacherUserName);
        for(SecTime secTime:secTimes)
        {
            Integer weeks = secTime.getWeeks();
            Integer weekDay = secTime.getWeekDay();
            Integer classNum = secTime.getClassNum();
            Map<String,Integer> map = new HashMap<>();
            map.put("weeks",weeks);
            map.put("weekDay",weekDay);
            map.put("classNum",classNum);
            if(stMapper.isConflict(map,userName)!=0)
                result = 1;
            break;
        }

        if(result == 0){
            try {
                tMapper.insert(takes);
                sqlSession.commit();
            }catch (Exception e){
                System.out.println(e.toString());
                result = 1;
                sqlSession.rollback();
            }
        }

        if(result == 0){    // 若插入成功
            try {
                sMapper.addCurrentNum(courseId, semester, year, teacherUserName);
                sqlSession.commit();
            }catch (Exception e){
                System.out.println(e.toString());
            }

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
    public int delCourseTakes(String userName, String semester, String year, String courseId, String teacherUserName) {
        Takes takes = new Takes(semester, year, courseId, userName, null ,null, teacherUserName);

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TakesMapper tMapper = sqlSession.getMapper(TakesMapper.class);
        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
        int result = 1;
        int takesStatus = 0;
        try {
            takesStatus = tMapper.delete(takes);
            System.out.println("rows changed:" + takesStatus);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println(e.toString());
            result = 2;
            sqlSession.rollback();
        }
        if(takesStatus != 0){    // 若删除成功
            int sectionStatus = sMapper.delCurrentNum(courseId, semester, year, teacherUserName);
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
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        TakesMapper takesMapper = sqlSession.getMapper(TakesMapper.class);
        List<TakesCourseStudentVO> itemList;
        itemList = takesMapper.getTakes(user_name);
        int pageNum = takesMapper.getSearchPageNumber(user_name);
//        sqlSession.commit();
//        sqlSession.close();
        return itemList;
    }

    @Override
    public GpaVO getGPA(String userName, String from, String to, String type) {
        // 符合 [n个数字]-[n个数字]-[n个数字] 的正则表达式
        String pattern = "^\\d+.-\\d+.-\\d+";

        // 如果不符合，埋了吧，返回错误
        boolean matchPattern = Pattern.matches(pattern, from) && Pattern.matches(pattern, to);
        if(!matchPattern)
        {
            return null;
        }

        return takesMapper.getGPA(userName, from, to);
    }
}
