package com.ttsh.mc.config.exception;

import com.ttsh.mc.config.response.ResponseCode;

/**
 * Project: mc
 * Package: com.ttsh.mc.config.exception
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
public class MyException extends RuntimeException {

    private ResponseCode code;

    private Object obj;

    public MyException(ResponseCode code, String msg, Object obj) {
        super(msg);
        this.code = code;
        this.obj = obj;
    }

    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
