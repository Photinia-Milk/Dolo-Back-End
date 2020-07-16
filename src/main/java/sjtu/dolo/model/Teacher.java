package sjtu.dolo.model;

public class Teacher {
    private String teacherID;
    private String name;
    private String user_name;

    public Teacher() {
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
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

    public Teacher(String teacherID, String name, String user_name) {
        this.teacherID = teacherID;
        this.name = name;
        this.user_name = user_name;
    }
}
