package sjtu.dolo.model;

public class Admin {
    private String adminID;
    private String name;
    private String userID;
    private String password;

    public Admin() {
    }

    public Admin(String adminID, String name, String userID, String password) {
        this.adminID = adminID;
        this.name = name;
        this.userID = userID;
        this.password = password;
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
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
