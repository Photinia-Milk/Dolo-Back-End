package sjtu.dolo.utils.msgutils;

import net.sf.json.JSONObject;

public class Msg {
    private int status; //状态值
    private String msg; //信息
    private JSONObject data; //待传数据

    public Msg(){

    }

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
}
