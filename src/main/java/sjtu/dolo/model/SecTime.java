package sjtu.dolo.model;

public class SecTime {
    private String timeSlotId;
    private String semester;
    private String year;
    private String courseId;
    private String teacherUserName;
    private Integer weeks;
    private Integer weekDay;
    private Integer classNum;
    public SecTime() {
    }

    public SecTime(String timeSlotId, String semester, String year, String courseId, String teacherUserName, Integer weeks, Integer weekDay, Integer classNum) {
        this.timeSlotId = timeSlotId;
        this.semester = semester;
        this.year = year;
        this.courseId = courseId;
        this.teacherUserName = teacherUserName;
        this.weeks = weeks;
        this.weekDay = weekDay;
        this.classNum = classNum;
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

    public Integer getWeeks() {
        return weeks;
    }

    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "SecTime{" +
                "timeSlotId='" + timeSlotId + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", courseId='" + courseId + '\'' +
                ", teacherUserName='" + teacherUserName + '\'' +
                ", weeks=" + weeks +
                ", weekDay=" + weekDay +
                ", classNum=" + classNum +
                '}';
    }
}
