package sjtu.dolo.model;

import java.util.Date;

public class Student {
    private String studentID;
    private String name;
    private String user_name;
    private String phone;
    private String address;
    private short gender;
    private Date birthday;
    private Date admisson_date;
    private String document_type;
    private String country;
    private String academic_year;
    public Student() {
    }

    public Student(String studentID, String name, String user_name, String phone, String address, short gender, Date birthday, Date admisson_date, String document_type, String country, String academic_year) {
        this.studentID = studentID;
        this.name = name;
        this.user_name = user_name;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.admisson_date = admisson_date;
        this.document_type = document_type;
        this.country = country;
        this.academic_year = academic_year;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
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
}
