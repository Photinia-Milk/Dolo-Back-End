package sjtu.dolo.serviceimpl;

import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.CourseMapper;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.StudentMapper;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.model.*;

import sjtu.dolo.service.StudentService;
import sjtu.dolo.utils.MybatisUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<Integer, List<Course>> findCourseValid(Integer startIdx, Integer pageSize){
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, List<Course>> returnMap = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);
        List<Course> itemList;
        int pageNum;
        pageNum = courseMapper.getPageNumber();
        itemList = courseMapper.getCourse(map);
        returnMap.put(pageNum, itemList);
//        return itemList;
        return returnMap;
    }

    @Override
    public Map<Integer, List<Course>> findCourse(String searchString, Integer startIdx, Integer pageSize) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, List<Course>> returnMap = new HashMap<>();
        map.put("startIndex", startIdx);
        map.put("pageSize", pageSize);
        System.out.println(map);
        List<Course> itemList;
        int pageNum;
        String search = "%"+searchString+"%";

//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        SectionMapper sMapper = sqlSession.getMapper(SectionMapper.class);
//        itemList = sMapper.getSectionLike(search, map);
//        sqlSession.commit();
//        sqlSession.close();
//        System.out.println(itemList);
        pageNum = courseMapper.getSearchPageNumber(search);
        itemList = courseMapper.getCourseLike(map,search);
        returnMap.put(pageNum, itemList);
//        return itemList;
        return returnMap;
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
    public int addCourseTakes(JSONObject data) {
        String user_name = data.getString("userName");
        String semester = "1";
        String year = "2020-2021";
        String courseID = data.getString("courseId");
        String teacherUserName = data.getString("teacherUserName");
        Takes takes = new Takes(semester, year, courseID, user_name, null ,null, teacherUserName);

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
            int sectionStatus = sMapper.updateCurrentNum(courseID, semester, year, teacherUserName);
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
        String user_name = data.getString("userName");
        String semester = "1";
        String year = "2020-2021";
        String courseID = data.getString("courseId");
        String teacherUserName = data.getString("teacherUserName");
        Takes takes = new Takes(semester, year, courseID, user_name, null ,null, teacherUserName);

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
            int sectionStatus = sMapper.updateCurrentNum(courseID, semester, year, teacherUserName);
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
    public Map<Integer, List<TakesCourseStudentVO>> findTakeList(String user_name) {
//        return studentMapper.getAllTakes(user_name);
//        QueryWrapper<Takes> takesQueryWrapper = new QueryWrapper<>();
//        takesQueryWrapper
//                .eq("user_name", user_name);
//        return takesMapper.selectList(takesQueryWrapper);
//        return takesMapper.getTakes(user_name);
//
        Map<Integer, List<TakesCourseStudentVO>> returnMap = new HashMap<>();
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TakesMapper takesMapper = sqlSession.getMapper(TakesMapper.class);
        List<TakesCourseStudentVO> itemList;
        itemList = takesMapper.getTakes(user_name);
        int pageNum = takesMapper.getSearchPageNumber(user_name);
        sqlSession.commit();
        sqlSession.close();
        returnMap.put(pageNum, itemList);
        return returnMap;
    }


}
