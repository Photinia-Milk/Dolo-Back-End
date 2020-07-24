package sjtu.dolo.model;

public class SecTime {
    private String timeSlotId;
    private String semester;
    private String year;
    private String courseId;
    private String teacherUserName;
    private String weeks;

    public SecTime() {
    }

    public SecTime(String timeSlotId, String semester, String year, String courseId, String teacherUserName, String weeks) {
        this.timeSlotId = timeSlotId;
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.teacherUserName = teacherUserName;
        this.weeks = weeks;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
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

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    @Override
    public String toString() {
        return "SecTime{" +
                "timeSlotId='" + timeSlotId + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", weeks='" + weeks + '\'' +
                '}';
    }
}
