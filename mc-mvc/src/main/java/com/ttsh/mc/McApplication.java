package com.ttsh.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project: mc
 * Package: com.ttsh.mc
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
@SpringBootApplication
@EnableCaching
public class McApplication {

    private static final Logger logger = LoggerFactory.getLogger(McApplication.class);

    public static void main(String[] args) {

        logger.info("接口服务启动");

        SpringApplication.run(McApplication.class, args);
    }
}