package com.ttsh.mc.service;

import com.ttsh.mc.model.Country;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 国家信息 服务类
 * </p>
 *
 * @author Mars
 * @since 2018-04-25
 */
public interface CountryService extends IService<Country> {

    Country getByID(String id);
}
