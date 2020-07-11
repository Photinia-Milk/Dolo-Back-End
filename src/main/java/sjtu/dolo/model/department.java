package sjtu.dolo.model;

public class department {
    private String deptID;
    private String dept_name;

    public department(String deptID, String dept_name) {
        this.deptID = deptID;
        this.dept_name = dept_name;
    }

    public department() {
    }

    public String getDeptID() {
        return deptID;
    }

    public void setDeptID(String deptID) {
        this.deptID = deptID;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "department{" +
                "deptID='" + deptID + '\'' +
                ", dept_name='" + dept_name + '\'' +
                '}';
    }
}
