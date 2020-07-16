package sjtu.dolo.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

public class SectionCourseTimeSlotVO {
    private String secID; //学期编号
    private String semester; //学期
    private String year; //学年
    private String timeSlotID; //时间段编号
    private String courseID; //课号
    private String building; //教学楼
    private String roomNumber; //房间号
    private BigDecimal credits; //学分
    private String weeks; //上课周数
    private int maxNum; //最大选课人数
    private int currentNum; //当前选课人数
    private String deptID; //院系编号
    private String courseName; //课程名称
    private String description; //课程描述
    private String day; //日期
    private Time startTime; //开始时间
    private Time endTime; //结束时间

    public SectionCourseTimeSlotVO() {
    }

    public SectionCourseTimeSlotVO(String secID, String semester, String year, String timeSlotID, String courseID, String building, String roomNumber, BigDecimal credits, String weeks, int maxNum, int currentNum, String deptID, String courseName, String description, String day, Time startTime, Time endTime) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.courseID = courseID;
        this.building = building;
        this.roomNumber = roomNumber;
        this.credits = credits;
        this.weeks = weeks;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
        this.deptID = deptID;
        this.courseName = courseName;
        this.description = description;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

//    public String getSecID() {
//        return secID;
//    }
//
//    public void setSecID(String secID) {
//        this.secID = secID;
//    }
//
//    public String getSemester() {
//        return semester;
//    }
//
//    public void setSemester(String semester) {
//        this.semester = semester;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getTimeSlotID() {
//        return timeSlotID;
//    }
//
//    public void setTimeSlotID(String timeSlotID) {
//        this.timeSlotID = timeSlotID;
//    }
//
//    public String getCourseID() {
//        return courseID;
//    }
//
//    public void setCourseID(String courseID) {
//        this.courseID = courseID;
//    }
//
//    public String getBuilding() {
//        return building;
//    }
//
//    public void setBuilding(String building) {
//        this.building = building;
//    }
//
//    public String getRoomNumber() {
//        return roomNumber;
//    }
//
//    public void setRoomNumber(String roomNumber) {
//        this.roomNumber = roomNumber;
//    }
//
//    public BigDecimal getCredits() {
//        return credits;
//    }
//
//    public void setCredits(BigDecimal credits) {
//        this.credits = credits;
//    }
//
//    public String getWeeks() {
//        return weeks;
//    }
//
//    public void setWeeks(String weeks) {
//        this.weeks = weeks;
//    }
//
//    public int getMaxNum() {
//        return maxNum;
//    }
//
//    public void setMaxNum(int maxNum) {
//        this.maxNum = maxNum;
//    }
//
//    public int getCurrentNum() {
//        return currentNum;
//    }
//
//    public void setCurrentNum(int currentNum) {
//        this.currentNum = currentNum;
//    }
//
//    public String getDeptID() {
//        return deptID;
//    }
//
//    public void setDeptID(String deptID) {
//        this.deptID = deptID;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDay() {
//        return day;
//    }
//
//    public void setDay(String day) {
//        this.day = day;
//    }
//
//    public Time getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Time startTime) {
//        this.startTime = startTime;
//    }
//
//    public Time getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(Time endTime) {
//        this.endTime = endTime;
//    }

    @Override
    public String toString() {
        return "SectionCourseTimmSlotVO{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", building='" + building + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", credits=" + credits +
                ", weeks='" + weeks + '\'' +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                ", deptID='" + deptID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", day='" + day + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionCourseTimeSlotVO that = (SectionCourseTimeSlotVO) o;
        return maxNum == that.maxNum &&
                currentNum == that.currentNum &&
                secID.equals(that.secID) &&
                semester.equals(that.semester) &&
                year.equals(that.year) &&
                timeSlotID.equals(that.timeSlotID) &&
                courseID.equals(that.courseID) &&
                Objects.equals(building, that.building) &&
                Objects.equals(roomNumber, that.roomNumber) &&
                Objects.equals(credits, that.credits) &&
                Objects.equals(weeks, that.weeks) &&
                deptID.equals(that.deptID) &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(day, that.day) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secID, semester, year, timeSlotID, courseID, building, roomNumber, credits, weeks, maxNum, currentNum, deptID, courseName, description, day, startTime, endTime);
    }
}
