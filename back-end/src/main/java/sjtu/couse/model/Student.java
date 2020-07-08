package sjtu.couse.model;

import java.util.Date;

public class Student {
    private String studentID;
    private String name;
    private String userID;
    private String password;
    private String phone;
    private String address;
    private short gender;
    private Date birthday;
    private Date admisson_date;
    private String document_type;
    private String country;

    public Student() {
    }

    public Student(String studentID, String name, String userID, String password, String phone, String address, short gender, Date birthday, Date admisson_date, String document_type, String country) {
        this.studentID = studentID;
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.admisson_date = admisson_date;
        this.document_type = document_type;
        this.country = country;
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", admisson_date=" + admisson_date +
                ", document_type='" + document_type + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
