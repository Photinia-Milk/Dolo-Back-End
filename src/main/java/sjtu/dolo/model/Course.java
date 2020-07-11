package sjtu.dolo.model;

public class Course {
    private String courseID;
    private String deptID;
    private String courseName;
    private String description;

    public Course() {
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
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

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", deptID='" + deptID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
