package sjtu.dolo.model;

import java.math.BigDecimal;

public class Section {

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

    public Section() {
    }

    public Section(String sectionID, String semester, String year, String timeSlotID, String courseID, String building, String roomNumber, BigDecimal credits, String weeks, int maxNum, int currentNum) {
        this.secID = sectionID;
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
    }

    public String getSecID() {
        return secID;
    }

    public void setSecID(String sectionID) {
        this.secID = sectionID;
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

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
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

    @Override
    public String toString() {
        return "Section{" +
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
                '}';
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
}
