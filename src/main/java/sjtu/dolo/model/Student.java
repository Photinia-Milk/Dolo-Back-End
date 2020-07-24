package sjtu.dolo.model;

import java.util.Date;

public class Student {
    private String userName; //用户名
    private String name;
    private String deptName;
    private String grade;
    private Boolean gender;
    private Date admissionDate;
    private String country;
    private String documentType;
    private String phone;
    private String address;

    public Student() {
    }

    public Student(String userName, String name, String deptName, String grade, Boolean gender, Date admissionDate, String country, String documentType, String phone, String address) {
        this.userName = userName;
        this.name = name;
        this.deptName = deptName;
        this.grade = grade;
        this.gender = gender;
        this.admissionDate = admissionDate;
        this.country = country;
        this.documentType = documentType;
        this.phone = phone;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
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

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", grade='" + grade + '\'' +
                ", gender=" + gender +
                ", admissionDate=" + admissionDate +
                ", country='" + country + '\'' +
                ", documentType='" + documentType + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
