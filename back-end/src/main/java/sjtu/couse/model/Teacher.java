package sjtu.couse.model;

public class Teacher {
    private String teacherID;
    private String name;
    private String userID;
    private String password;

    public Teacher() {
    }

    public Teacher(String teacherID, String name, String userID, String password) {
        this.teacherID = teacherID;
        this.name = name;
        this.userID = userID;
        this.password = password;
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

    @Override
    public String toString() {
        return "teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
