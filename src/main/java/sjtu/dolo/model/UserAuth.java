package sjtu.dolo.model;

public class UserAuth {
    private String userName; //用户名
    private String password; //密码
    private String type; //用户类型

    public UserAuth() {
    }

    public UserAuth(String userName, String password, String type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserAuth{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
