package sjtu.dolo.model;

import java.math.BigDecimal;

public class Takes {
    private String secID;
    private String semester;
    private String year;
    private String timeSlotID;
    private String studentID;
    private BigDecimal grade;
    private BigDecimal gpa;

    public Takes() {
    }

    public Takes(String secID, String semester, String year, String timeSlotID, String studentID, BigDecimal grade, BigDecimal gpa) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.studentID = studentID;
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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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
        return "takes{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }
}
