package sjtu.dolo.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

public class SectionCourseTimeSlotVO {
    private String semester; //学期
    private String year; //学年
    private String courseId; //课号
    private String teacherUserName;
    private String courseTime;
    private String location;
    private String remarks;
    private String model;
    private int maxNum;
    private int currentNum;
    private String courseName;
    private String courseType;
    private String electiveType;
    private BigDecimal credits;
}
