package sjtu.dolo.utils.msgutils;

import net.sf.json.JSONObject;

import java.util.Objects;

public class Msg {
    private int status; //状态值
    private String msg; //信息
    private JSONObject data; //待传数据

    public Msg(int status, String extra, JSONObject data){
        this.status = status;
        this.msg = extra;
        this.data = data;
    }

    public Msg(int status, String extra){
        this.status = status;
        this.msg = extra;
        this.data = null;
    }

    public Msg() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Msg msg1 = (Msg) o;
        return status == msg1.status &&
                Objects.equals(msg, msg1.msg) &&
                Objects.equals(data, msg1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, msg, data);
    }
}
