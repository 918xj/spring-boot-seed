package com.ttsh.mc.controller;

import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ttsh.mc.aspect.auth.AccessChecker;
import com.ttsh.mc.aspect.auth.AuthChecker;
import com.ttsh.mc.config.exception.MyException;
import com.ttsh.mc.config.response.ResponseCode;
import com.ttsh.mc.config.response.ResponseResult;
import com.ttsh.mc.config.response.ResponseResultUtil;
import com.ttsh.mc.mapper.CountryMapper;
import com.ttsh.mc.model.Country;
import com.ttsh.mc.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * Project: mc
 * Package: com.ttsh.mc.controller
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
@RestController
@Validated
@RequestMapping("/country")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryMapper countryMapper;

    @GetMapping(value = "/getbyid")
    public ResponseResult getByID(
            @NotBlank(message = "参数不能为空") String id
    ) throws Exception {
        Country country = countryService.getByID(id);
        return ResponseResultUtil.success(country);
    }

    @AccessChecker
    @AuthChecker
    @GetMapping(value = "/getall")
    public ResponseResult getAll() throws Exception {
        List<Country> list = countryMapper.selectPage(
                new Page<Country>(2, 10),
                new EntityWrapper<Country>()
        );
        return ResponseResultUtil.success(list);
    }

    @GetMapping(value = "/add")
    @Transactional(rollbackFor = MyException.class)
    public ResponseResult add() throws Exception {
        Country country = new Country();
        country.setCountrycode("123");
        country.setCountryname("test");

        Integer result = countryMapper.insert(country);
        if (result == 1) {
//            return ResponseResultUtil.success();
            throw new MyException(ResponseCode.INTERNAL_SERVER_ERROR, "新增失败", null);
        } else {
            throw new MyException(ResponseCode.INTERNAL_SERVER_ERROR, "新增失败", null);
        }
    }
}

