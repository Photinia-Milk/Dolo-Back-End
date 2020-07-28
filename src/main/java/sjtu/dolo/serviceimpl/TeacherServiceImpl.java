package sjtu.dolo.serviceimpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.TakesMapper;
import sjtu.dolo.mapper.TeacherMapper;
import sjtu.dolo.model.Takes;
import sjtu.dolo.model.Teacher;
import sjtu.dolo.service.TeacherService;
import sjtu.dolo.utils.MybatisUtils;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Override
    public String score(String userName, String semester, String year, String courseId, String teacherUserName,Double grade) {
        Double gpa = null;
        double gpa1;
        int result = 0;
        if(grade >= 95 && grade <= 100) gpa = 4.3;
        else if(grade >= 90 && grade < 95) gpa = 4.0;
        else if(grade >= 85 && grade < 90) gpa = 3.7;
        else if(grade >= 80 && grade < 85) gpa = 3.4;
        else if(grade >= 75 && grade < 80) gpa = 3.0;
        else if(grade >= 70 && grade < 75) gpa = 2.7;
        else if(grade >= 67 && grade < 69) gpa = 2.3;
        else if(grade >= 65 && grade < 66) gpa = 2.0;
        else if(grade >= 62 && grade < 64) gpa = 1.7;
        else if(grade >= 60 && grade < 61) gpa = 1.0;
        else if(grade >= 0 && grade <60) gpa = 0.0;
        else return "打分错误，请检查打分是否在打分区间内";

        Takes takes = new Takes(semester, year, courseId, userName, grade, gpa, teacherUserName);

        System.out.println(takes.toString());

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

//        Double grade1 = takes.getGrade();
//        System.out.println(grade1);
//        Double gpa1 = takes.getGpa();
//        System.out.println(gpa1);
        try{
            result = teacherMapper.score(takes);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println(e);
            sqlSession.rollback();
        }

        if(result == 1) return "打分成功";
        return "打分失败，请重试";
    }
}
