# spring-boot-seed
springboot 2.0起步脚手架，开箱即用。

#### 内容说明：
- 集成mybatis-plus及自动代码生成
- 集成hutool工具类
- 集成swagger2，生成Api文件并可以在线调试
- 1级缓存用caffeine，2级缓存用redis
- 采用druid做数据库连接池和监控
- 日志用log4j2来实现。
- 另外用AOP实现了权限校验，包括通用token检验和access检查（需要自己实现业务逻辑）。
- 项目分子module开发，开发人员专注在mvc里面写逻辑
- 封装异常处理，统一返回信息，
- 本项目目标针对前后端分离开发的项目专门做API接口应用，适合前后端用json交互的场景，基本作为一个项目起步的脚手架可以拿来即用

#### 开发说明：
- 在intellij idea里导入项目
- 在数据库里导入mc.sql
- 修改mvc里面resources的配置文件内容
- 运行mvc里面的McApplication.java
- 代码自动生成在mvc里面的test下，自行修改对应的表