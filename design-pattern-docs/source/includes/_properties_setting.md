# 配置文件说明

在每一个自动化测试项目里面都有一个配置文件，这个配置文件主要配置如下的内容：

- 不同数据库的连接
- 不同应用的WEB应用根路径
- 不同应用的API根路径
- 一些配置项

## 通用的配置规则说明

不同测试环境和测试应用有关的配置，如果你测试的应用没有在配置文件中，那么请添加你的应用配置到env.properties文件中
以下是一个费用的一个配置，说明如下：

integration： 表示是集成环境，如果添加test.feiyong.****.*****则表示为测试环境的配置
jdbc.*** : 都是和数据库相关的
integration.feiyong.service.root ： 集成费用的API根路径
integration.feiyong.domain.url： 集成费用的WEB根路径

```java
//如果你测试的应用没有在配置文件中，那么请添加你的应用配置到env.properties文件中
integration.feiyong.jdbc.url= jdbc:sqlserver://192.168.3.66:1433;databaseName=AffairsCenter
integration.feiyong.jdbc.driver = com.microsoft.sqlserver.jdbc.SQLServerDriver
integration.feiyong.jdbc.username=***
integration.feiyong.jdbc.password=***
integration.feiyong.service.root= http://feiyong.dooioo.org
integration.feiyong.domain.url=http://feiyong.dooioo.org
```

如果你把feiyong给为ky，就表示ky的配置，如果想使用ky的配置，一般可以通过以下方式指定使用那个应用的：

```java
//获取客源的所有配置信息
 EnviromentHelper.get("ky").****

//使用ky的数据库
SpringJdbcTemplateUtils.useDatabase("ky").*****
```

## 其他配置

还有一些其他配置可以在配置文件中修改：

```java
// 默认应用
default.appname=fangyuan
//当前测试环境
target.environment=integration
//open api 根路径
integration.openapi.root=http://open.dooioo.org

// 默认打开浏览器来展示测试结果
openbrowser=true

//将API返回结果写到本地文件
write_api_response =true

```
