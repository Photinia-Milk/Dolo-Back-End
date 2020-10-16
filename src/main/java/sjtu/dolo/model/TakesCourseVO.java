package sjtu.dolo.model;

import java.sql.Time;
import java.util.Objects;

public class TakesCourseVO {
    private String semester; //学期
    private String year; //学年
    private String courseId; //课号
    private String userName;
    private String teacherUserName;
    private Double grade;
    private Double gpa;
    private String courseName;
    private String courseType;
    private String electiveType;
    private Double credits;

    public TakesCourseVO() {
    }

    public TakesCourseVO(String semester, String year, String courseId, String userName, String teacherUserName, Double grade, Double gpa, String courseName, String courseType, String electiveType, Double credits) {
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.userName = userName;
        this.teacherUserName = teacherUserName;
        this.grade = grade;
        this.gpa = gpa;
        this.courseName = courseName;
        this.courseType = courseType;
        this.electiveType = electiveType;
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTeacherUserName() {
        return teacherUserName;
    }

    public void setTeacherUserName(String teacherUserName) {
        this.teacherUserName = teacherUserName;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getElectiveType() {
        return electiveType;
    }

    public void setElectiveType(String electiveType) {
        this.electiveType = electiveType;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "TakesCourseVO{" +
                "semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", userName='" + userName + '\'' +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", electiveType='" + electiveType + '\'' +
                ", credits=" + credits +
                '}';
    }
}
