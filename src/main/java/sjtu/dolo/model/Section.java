package sjtu.dolo.model;

import java.util.Objects;

public class Section {

    private String semester; //学期
    private String year; //学年
    private String courseId; //时间段编号
    private String teacherUserName; //课号
    private String courseTime;
    private String location;
    private String remarks;
    private String model;
    private int maxNum; //最大选课人数
    private int currentNum; //当前选课人数

    public Section() {
    }

    public Section(String semester, String year, String courseId, String teacherUserName, String courseTime, String location, String remarks, String model, int maxNum, int currentNum) {
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.teacherUserName = teacherUserName;
        this.courseTime = courseTime;
        this.location = location;
        this.remarks = remarks;
        this.model = model;
        this.maxNum = maxNum;
        this.currentNum = currentNum;
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

    @Override
    public String toString() {
        return "Section{" +
                "semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", courseTime='" + courseTime + '\'' +
                ", location='" + location + '\'' +
                ", remarks='" + remarks + '\'' +
                ", model='" + model + '\'' +
                ", maxNum=" + maxNum +
                ", currentNum=" + currentNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return maxNum == section.maxNum &&
                currentNum == section.currentNum &&
                Objects.equals(semester, section.semester) &&
                Objects.equals(year, section.year) &&
                Objects.equals(courseId, section.courseId) &&
                Objects.equals(teacherUserName, section.teacherUserName) &&
                Objects.equals(courseTime, section.courseTime) &&
                Objects.equals(location, section.location) &&
                Objects.equals(remarks, section.remarks) &&
                Objects.equals(model, section.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semester, year, courseId, teacherUserName, courseTime, location, remarks, model, maxNum, currentNum);
    }
}
