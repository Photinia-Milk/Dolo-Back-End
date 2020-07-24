package sjtu.dolo.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

public class SectionCourseVO {
    private String semester; //学期
    private String year; //学年
    private String courseId; //课号
    private String teacherUserName;
    private String courseTime;
    private String location;
    private String remarks;
    private String model;
    private int maxNum;
    private int currentNum;
    private String courseName;
    private String courseType;
    private String electiveType;
    private BigDecimal credits;

    public SectionCourseVO() {
    }

    public SectionCourseVO(String semester, String year, String courseId, String teacherUserName, String courseTime, String location, String remarks, String model, int maxNum, int currentNum, String courseName, String courseType, String electiveType, BigDecimal credits) {
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.teacherUserName = teacherUserName;
        this.courseTime = courseTime;
        this.location = location;
        this.remarks = remarks;
        this.model = model;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
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

    public String getTeacherUserName() {
        return teacherUserName;
    }

    public void setTeacherUserName(String teacherUserName) {
        this.teacherUserName = teacherUserName;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
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

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "SectionCourseVO{" +
                "semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", location='" + location + '\'' +
                ", remarks='" + remarks + '\'' +
                ", model='" + model + '\'' +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", electiveType='" + electiveType + '\'' +
                ", credits=" + credits +
                '}';
    }
}
