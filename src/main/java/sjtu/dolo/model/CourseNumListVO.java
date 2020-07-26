package sjtu.dolo.model;

import java.util.List;

public class CourseNumListVO {
    private Integer courseNum;
    private List<Course> courseList;

    public CourseNumListVO(Integer courseNum, List<Course> courseList) {
        this.courseNum = courseNum;
        this.courseList = courseList;
    }

    public CourseNumListVO() {
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
