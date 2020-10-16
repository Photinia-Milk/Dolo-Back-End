package sjtu.dolo.model;

import java.sql.Time;

public class TimeSlot {
    private String timeSlotId; //时间段编号
    private String day; //日期
    private int startTime; //开始时间
    private int endTime; //结束时间

    public TimeSlot() {
    }

    public TimeSlot(String timeSlotId, String day, int startTime, int endTime) {
        this.timeSlotId = timeSlotId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(String timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "timeSlotId='" + timeSlotId + '\'' +
                ", day='" + day + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
