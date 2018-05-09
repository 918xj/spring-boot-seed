package com.ttsh.mc.config.response;

/**
 * Project: mc
 * Package: com.ttsh.mc.config.response
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
public class ResponseResultUtil {

    private static final String DEFAULT_SUCCESS_MESSAGE = "success";

    public static ResponseResult success(Object obj) {
        ResponseResult result = new ResponseResult();
        result.setCode(ResponseCode.SUCCESS);
        result.setMsg(DEFAULT_SUCCESS_MESSAGE);
        result.setData(obj);

        return result;
    }

    public static ResponseResult success() {
        return success(null);
    }

    public static ResponseResult error(ResponseCode code, String msg, Object obj) {
        ResponseResult resutl = new ResponseResult();
        resutl.setCode(code);
        resutl.setMsg(msg);
        resutl.setData(obj);

        return resutl;
    }

    public static ResponseResult error(String msg) {
        return error(ResponseCode.FAIL, msg, null);
    }

    public static ResponseResult error(ResponseCode code, String msg) {
        return error(code, msg, null);
    }
}
