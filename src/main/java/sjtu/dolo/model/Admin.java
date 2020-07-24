package sjtu.dolo.model;

import java.util.Objects;

public class Admin {
    private String userName; //管理员编号
    private String name; //管理员姓名

    public Admin() {
    }

    public Admin(String userName, String name) {
        this.userName = userName;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
