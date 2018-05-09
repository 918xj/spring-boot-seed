package com.ttsh.mc.config.mybatisplus;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Project: mc
 * Package: com.ttsh.mc.config.mybatisplus
 * Description: ...
 * <p>
 * @author Mars
 * Data: 2018/5/3 下午4:16
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("新增的时候干点不可描述的事情");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("更新的时候干点不可描述的事情");
    }
}
