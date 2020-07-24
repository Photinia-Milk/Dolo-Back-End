package sjtu.dolo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class TakesCourseStudentVO {
    private String courseName;
    private String courseType;
    private String electiveType;
    private double credit;
    private String semester; //学期
    private String year; //学年
    private String courseId; //课号
    private String userName; //用户名
    private String timeslotId; //时间段编号
    private BigDecimal grade; //成绩
    private BigDecimal gpa; //GPA
    private String teacherUserName;
    private String courseTime;
    private String remarks;
    private String model;
    private int maxNum;
    private int currentNum;
    private String timeSlotId;
    private String weeks;
    private int startTime;
    private int endTime;

    public TakesCourseStudentVO(String courseName, String courseType, String electiveType, double credit, String semester, String year, String courseId, String userName, String timeslotId, BigDecimal grade, BigDecimal gpa, String teacherUserName, String courseTime, String remarks, String model, int maxNum, int currentNum, String timeSlotId, String weeks, int startTime, int endTime) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.electiveType = electiveType;
        this.credit = credit;
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.userName = userName;
        this.timeslotId = timeslotId;
        this.grade = grade;
        this.gpa = gpa;
        this.teacherUserName = teacherUserName;
        this.courseTime = courseTime;
        this.remarks = remarks;
        this.model = model;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
        this.timeSlotId = timeSlotId;
        this.weeks = weeks;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public TakesCourseStudentVO() {
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

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
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

    public String getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(String timeslotId) {
        this.timeslotId = timeslotId;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigDecimal getGpa() {
        return gpa;
    }

    public void setGpa(BigDecimal gpa) {
        this.gpa = gpa;
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

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "TakesCourseStudentVO{" +
                "courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", electiveType='" + electiveType + '\'' +
                ", credit=" + credit +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", userName='" + userName + '\'' +
                ", timeslotId='" + timeslotId + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", remarks='" + remarks + '\'' +
                ", model='" + model + '\'' +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                ", timeSlotId='" + timeSlotId + '\'' +
                ", weeks='" + weeks + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

}
