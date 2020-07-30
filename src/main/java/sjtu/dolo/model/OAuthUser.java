package sjtu.dolo.model;

import java.util.Objects;

public class OAuthUser {
    private int id;
    private String userName;
    private String type;

    public OAuthUser() {
    }

    public OAuthUser(int id, String userName, String type) {
        this.id = id;
        this.userName = userName;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OAuthUser oAuthUser = (OAuthUser) o;
        return id == oAuthUser.id &&
                Objects.equals(userName, oAuthUser.userName) &&
                Objects.equals(type, oAuthUser.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, type);
    }


}
