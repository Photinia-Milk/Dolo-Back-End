package sjtu.dolo.model;

import java.math.BigDecimal;

public class Takes {
    private String secID;
    private String semester;
    private String year;
    private String timeSlotID;
    private String courseID;
    private String user_name;
    private BigDecimal grade;
    private BigDecimal gpa;

    public Takes() {
    }

    public Takes(String secID, String semester, String year, String timeSlotID, String courseID, String user_name, BigDecimal grade, BigDecimal gpa) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.courseID = courseID;
        this.user_name = user_name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getSecID() {
        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    @Override
    public String toString() {
        return "Takes{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }
}
