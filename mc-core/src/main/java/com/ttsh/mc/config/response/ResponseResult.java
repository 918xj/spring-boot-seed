package com.ttsh.mc.config.response;

/**
 * Project: mc
 * Package: com.ttsh.mc.config.response
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
public class ResponseResult<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体的返回数据
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(ResponseCode ResultCode) {
        this.code = ResultCode.code();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
