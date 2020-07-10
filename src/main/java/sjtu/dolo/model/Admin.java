package sjtu.dolo.model;

public class Admin {
    private String adminID;
    private String name;
    private String user_name;

    public Admin() {
    }

    public Admin(String adminID, String name, String user_name) {
        this.adminID = adminID;
        this.name = name;
        this.user_name = user_name;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
