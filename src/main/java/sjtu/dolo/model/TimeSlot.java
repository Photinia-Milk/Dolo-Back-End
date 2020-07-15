package sjtu.dolo.model;

import java.sql.Time;

public class TimeSlot {
    private String timeSlotID; //时间段编号
    private String day; //日期
    private Time startTime; //开始时间
    private Time endTime; //结束时间

    public TimeSlot() {
    }

    public TimeSlot(String timeSlotID, String day, Time startTime, Time endTime) {
        this.timeSlotID = timeSlotID;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "timeSlotID='" + timeSlotID + '\'' +
                ", day='" + day + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
