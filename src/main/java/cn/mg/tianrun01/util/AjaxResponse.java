package cn.mg.tianrun01.util;

/**
 * 异步请求的响应对象
 */
public class AjaxResponse {
    private boolean  ok;//是否操作成功
    private int   stats;//请求状态码，404找不到页面，500后台错误，200成功
    private String  message;//请求信息
    private Object  data;//响应的数据

    public AjaxResponse(){}

    public AjaxResponse(Object data){
        this.data=data;
    }
    //增删改,没有返回值的成功方法
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setMessage("操作成功");
        ajaxResponse.setStats(200);
        return ajaxResponse;
    }

    public static AjaxResponse success(Object data){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setMessage("操作成功");
        ajaxResponse.setStats(200);
        ajaxResponse.setData(data);
        return ajaxResponse;
    }

    //error
    public static AjaxResponse error(){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setOk(false);
        ajaxResponse.setMessage("操作失败");
        ajaxResponse.setStats(500);
        return ajaxResponse;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
