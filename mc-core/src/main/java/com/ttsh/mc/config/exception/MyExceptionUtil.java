package com.ttsh.mc.config.exception;

import cn.hutool.core.exceptions.ValidateException;
import com.ttsh.mc.config.response.ResponseCode;
import com.ttsh.mc.config.response.ResponseResult;
import com.ttsh.mc.config.response.ResponseResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Project: mc
 * Package: com.ttsh.mc.config.exception
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
@ControllerAdvice
public class MyExceptionUtil {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult handle(Exception e) {
        if (e instanceof MyException) {
            MyException myexception = (MyException) e;
            return ResponseResultUtil.error(myexception.getCode(), myexception.getMessage(), myexception.getObj());
        } else if (e instanceof ValidateException) {
            ValidateException ve = (ValidateException) e;
            String errors = ve.getMessage();
            return ResponseResultUtil.error(ResponseCode.PARAMS_VALID_FAIL, errors, null);
        } else if (e instanceof NoHandlerFoundException) {
            return ResponseResultUtil.error(ResponseCode.NOT_FOUND, e.getMessage(), null);
        } else {
            Logger logger = LoggerFactory.getLogger(MyException.class);
            logger.error("[system excepiton] {}", e);
            return ResponseResultUtil.error(ResponseCode.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
