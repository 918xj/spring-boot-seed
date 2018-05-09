package com.ttsh.mc.service.impl;

import com.ttsh.mc.controller.TestController;
import com.ttsh.mc.model.Country;
import com.ttsh.mc.mapper.CountryMapper;
import com.ttsh.mc.service.CountryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 国家信息 服务实现类
 * </p>
 *
 * @author Mars
 * @since 2018-04-25
 */
@Service
@CacheConfig(cacheNames = "country")
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements CountryService {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Cacheable(value = "country", key = "#id")
    @Override
    public Country getByID(String id) {
        Country country = selectById(id);
        logger.info("从数据库里读");
        return  country;
    }
}
