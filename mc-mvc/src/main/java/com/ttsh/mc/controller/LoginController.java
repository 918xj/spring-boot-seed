package com.ttsh.mc.controller;

import com.ttsh.mc.config.response.ResponseResult;
import com.ttsh.mc.config.response.ResponseResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: mc
 * Package: com.ttsh.mc.controller
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @PostMapping(value = "/in")
    public ResponseResult in(String username, String password) {
        String[] result = {username, password};
        return ResponseResultUtil.success(result);
    }
}
