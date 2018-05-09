package com.ttsh.mc.aspect.auth;

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
@Order(1)
public class MyAccessAspect {

    private static final Logger logger = LoggerFactory.getLogger(MyAccessAspect.class);

    @Pointcut("@annotation(com.ttsh.mc.aspect.auth.AccessChecker)")
    public void accessCut() {
    }

    /**
     * 定义 advise
     */
    @Before("accessCut()")
    public void checkAccess() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        logger.info("Access检查 ===> " + request.getRequestURI());

        // todo: 实现access检查
    }
}
