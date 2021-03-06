package sjtu.dolo.model;

import java.util.Date;
import java.util.Objects;

public class TakesCourseStudentVO {
    private String courseName;
    private String courseType;
    private String electiveType;
    private Double credits;
    private String semester; //学期
    private String year; //学年
    private String courseId; //课号
    private String userName; //用户名
    private Double grade; //成绩
    private Double gpa; //GPA
    private String teacherUserName;
    private String courseTime;
    private String location;
    private String remarks;
    private String model;
    private int maxNum;
    private int currentNum;
    private String timeSlotId;
    private String weeks;
    private String day;
    private int startTime;
    private int endTime;

    public TakesCourseStudentVO(String courseName, String courseType, String electiveType, Double credits, String semester, String year, String courseId, String userName, Double grade, Double gpa, String teacherUserName, String courseTime, String location, String remarks, String model, int maxNum, int currentNum, String timeSlotId, String weeks, String day, int startTime, int endTime) {
        this.courseName = courseName;
        this.courseType = courseType;
        this.electiveType = electiveType;
        this.credits = credits;
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.userName = userName;
        this.grade = grade;
        this.gpa = gpa;
        this.teacherUserName = teacherUserName;
        this.courseTime = courseTime;
        this.location = location;
        this.remarks = remarks;
        this.model = model;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
        this.timeSlotId = timeSlotId;
        this.weeks = weeks;
        this.day = day;
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

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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
                ", credits=" + credits +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", userName='" + userName + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", location='" + location + '\'' +
                ", remarks='" + remarks + '\'' +
                ", model='" + model + '\'' +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                ", timeSlotId='" + timeSlotId + '\'' +
                ", weeks='" + weeks + '\'' +
                ", day='" + day + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakesCourseStudentVO that = (TakesCourseStudentVO) o;
        return  Math.abs(credits - that.credits) < 0.0001 &&
                maxNum == that.maxNum &&
                currentNum == that.currentNum &&
                startTime == that.startTime &&
                endTime == that.endTime &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(courseType, that.courseType) &&
                Objects.equals(electiveType, that.electiveType) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(year, that.year) &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(userName, that.userName) &&
                Math.abs(grade - that.grade) < 0.0001 &&
                Math.abs(gpa - that.gpa) < 0.0001 &&
                Objects.equals(teacherUserName, that.teacherUserName) &&
                Objects.equals(courseTime, that.courseTime) &&
                Objects.equals(location, that.location) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(model, that.model) &&
                Objects.equals(timeSlotId, that.timeSlotId) &&
                Objects.equals(weeks, that.weeks) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseType, electiveType, credits, semester, year, courseId, userName, grade, gpa, teacherUserName, courseTime, location, remarks, model, maxNum, currentNum, timeSlotId, weeks, day, startTime, endTime);
    }
}
