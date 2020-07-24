package sjtu.dolo.model;

public class Teacher {
    private String userName;
    private String deptName;
    private String rank;
    private String name;

    public Teacher(String userName, String deptName, String rank, String name) {
        this.userName = userName;
        this.deptName = deptName;
        this.rank = rank;
        this.name = name;
    }

    public Teacher() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "userName='" + userName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
