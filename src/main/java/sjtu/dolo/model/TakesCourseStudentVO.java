package sjtu.dolo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class TakesCourseStudentVO {
    private String secID; //学期编号
    private String semester; //学期
    private String year; //学年
    private String timeSlotID; //时间段编号
    private String courseID; //课号
    private String user_name; //用户名
    private BigDecimal grade; //成绩
    private BigDecimal gpa; //GPA
    private String deptID; //院系编号
    private String courseName; //课程名称
    private String description; //课程描述
    private String name;
    private String phone; //联系电话
    private String address; //家庭住址
    private short gender;
    private Date birthday;
    private Date admisson_date;
    private String document_type;
    private String country;
    private String academic_year;

    public TakesCourseStudentVO() {
    }

    public TakesCourseStudentVO(String secID, String semester, String year, String timeSlotID, String courseID, String user_name, BigDecimal grade, BigDecimal gpa, String deptID, String courseName, String description, String name, String phone, String address, short gender, Date birthday, Date admisson_date, String document_type, String country, String academic_year) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.courseID = courseID;
        this.user_name = user_name;
        this.grade = grade;
        this.gpa = gpa;
        this.deptID = deptID;
        this.courseName = courseName;
        this.description = description;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.admisson_date = admisson_date;
        this.document_type = document_type;
        this.country = country;
        this.academic_year = academic_year;
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

    public String getDeptID() {
        return deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getAdmisson_date() {
        return admisson_date;
    }

    public void setAdmisson_date(Date admisson_date) {
        this.admisson_date = admisson_date;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    @Override
    public String toString() {
        return "TakesCourseStudentVO{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", deptID='" + deptID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", admisson_date=" + admisson_date +
                ", document_type='" + document_type + '\'' +
                ", country='" + country + '\'' +
                ", academic_year='" + academic_year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakesCourseStudentVO that = (TakesCourseStudentVO) o;
        return gender == that.gender &&
                secID.equals(that.secID) &&
                semester.equals(that.semester) &&
                year.equals(that.year) &&
                timeSlotID.equals(that.timeSlotID) &&
                courseID.equals(that.courseID) &&
                user_name.equals(that.user_name) &&
                Objects.equals(grade, that.grade) &&
                Objects.equals(gpa, that.gpa) &&
                deptID.equals(that.deptID) &&
                Objects.equals(courseName, that.courseName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(admisson_date, that.admisson_date) &&
                Objects.equals(document_type, that.document_type) &&
                Objects.equals(country, that.country) &&
                Objects.equals(academic_year, that.academic_year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secID, semester, year, timeSlotID, courseID, user_name, grade, gpa, deptID, courseName, description, name, phone, address, gender, birthday, admisson_date, document_type, country, academic_year);
    }
}
