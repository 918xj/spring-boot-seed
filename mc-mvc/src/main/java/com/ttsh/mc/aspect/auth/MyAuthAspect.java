package com.ttsh.mc.aspect.auth;

import cn.hutool.core.util.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Project: mc
 * Package: com.ttsh.mc.aspect.auth
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
@Aspect
@Component
@Order(0)
public class MyAuthAspect {

    private static final Logger logger = LoggerFactory.getLogger(MyAuthAspect.class);

    @Pointcut("@annotation(com.ttsh.mc.aspect.auth.AuthChecker)")
    public void authCut() {
    }

    @Before("authCut()")
    public void checkAuth() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        logger.info("Auth操作 " + RandomUtil.randomUUID());

        // todo: 实现token检验
    }
}
