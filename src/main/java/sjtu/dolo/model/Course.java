package sjtu.dolo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Course {
    private String courseId; //课程编号
    private String electiveType; //院系编号
    private String courseName; //课程名称
    private String courseType; //课程描述
    private BigDecimal credits;

    public Course() {
    }

    public Course(String courseId, String electiveType, String courseName, String courseType, BigDecimal credits) {
        this.courseId = courseId;
        this.electiveType = electiveType;
        this.courseName = courseName;
        this.courseType = courseType;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getElectiveType() {
        return electiveType;
    }

    public void setElectiveType(String electiveType) {
        this.electiveType = electiveType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", electiveType='" + electiveType + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", credits=" + credits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId) &&
                Objects.equals(electiveType, course.electiveType) &&
                Objects.equals(courseName, course.courseName) &&
                Objects.equals(courseType, course.courseType) &&
                Objects.equals(credits, course.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, electiveType, courseName, courseType, credits);
    }
}
