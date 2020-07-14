package com.project.digital_store.base;

public class Result {


    /**
     * 获得成功结果
     * @return
     */
    public static com.project.digital_store.base.Result success(){
        return new com.project.digital_store.base.Result(true,null,null);
    }

    /**
     * 获得成功结果
     * @return
     */
    public static com.project.digital_store.base.Result success(String message){
        return new com.project.digital_store.base.Result(true,message,null);
    }

    /**
     * 获得成功结果
     * @return
     */
    public static com.project.digital_store.base.Result success(String message, Object data){
        return new com.project.digital_store.base.Result(true,message,data);
    }

    /**
     * 获得失败结果
     * @return
     */
    public static com.project.digital_store.base.Result fail(){
        return new com.project.digital_store.base.Result(true,null,null);
    }

    /**
     * 获得失败结果
     * @return
     */
    public static com.project.digital_store.base.Result fail(String message){
        return new com.project.digital_store.base.Result(true,message,null);
    }

    /**
     * 获得失败结果
     * @return
     */
    public static com.project.digital_store.base.Result fail(String message, Object data){
        return new com.project.digital_store.base.Result(true,message,data);
    }


    private boolean success;
    private String message;
    private Object data;

    private Result(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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
