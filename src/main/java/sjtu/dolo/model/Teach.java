package sjtu.dolo.model;

public class Teach {
    private String secID;
    private String semester;
    private String year;
    private String timeSlotID;
    private String user_name;
    private String courseID;

    public Teach() {
    }

    public Teach(String secID, String semester, String year, String timeSlotID, String user_name, String courseID) {
        this.secID = secID;
        this.semester = semester;
        this.year = year;
        this.timeSlotID = timeSlotID;
        this.user_name = user_name;
        this.courseID = courseID;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Teach{" +
                "secID='" + secID + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                ", timeSlotID='" + timeSlotID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", courseID='" + courseID + '\'' +
                '}';
    }
}