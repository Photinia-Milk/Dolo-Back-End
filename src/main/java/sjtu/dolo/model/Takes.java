package sjtu.dolo.model;


public class Takes {

    private String semester;
    private String year;
    private String courseId;
    private String userName;
    private Double grade;
    private Double gpa;
    private String teacherUserName;

    public Takes() {
    }

    public Takes(String semester, String year, String courseId, String userName, Double grade, Double gpa, String teacherUserName) {
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.userName = userName;
        this.grade = grade;
        this.gpa = gpa;
        this.teacherUserName = teacherUserName;
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

    @Override
    public String toString() {
        return "Takes{" +
                "semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", userName='" + userName + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", teacherUserName='" + teacherUserName + '\'' +
                '}';
    }
}
