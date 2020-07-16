package sjtu.dolo.model;

import java.util.Objects;

public class Admin {
    private String adminID; //管理员编号
    private String name; //管理员姓名
    private String user_name; //用户名

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
