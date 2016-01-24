# 接口测试常见问题

以下是整理的一些接口测试常见问题，包括以下几个方面：

- 配置文件
- 输入为空的测试
- TESTNG 的错误
- 验证结果
- 实际返回值为空

## 配置文件

有时在进行测试的时候会报一下的错误：

![img](/images/api_root_configuration.png)

**解决办法：**

  检查配置文件中的service.root配置是否和API 描述的JSON文件中的apiDomainName是否匹配，下例中是feiyong，那么json文件中apiDomainName为feiyong时则使用如下的地址 **http://feiyong.dooioo.org**

```java

//检查配置文件中的service.root配置是否和API 描述的JSON文件中的apiDomainName是否匹配，下例中是feiyong，那么json文件中apiDomainName为feiyong时则使用如下的地址 ** http://feiyong.dooioo.org **

integration.feiyong.service.root= http://feiyong.dooioo.org

//json file, apiDomainName 是assets，这里需要改成feiyong，才可以使用feiyong的路径
{
  "apiDomainName": "assets",
  "contentType": "application/json",
  "headers": {
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8"
  },
  "method": "GET",
  "pathParameters": [],
  "queryParameters": [],
  "resourceURL": "/asset/apply"
}

```

## 输入为空的测试

有时API测试过程中需要使用空字符串来表述输入为空，可以在EXCEL 对应的值中输入EMPTY 关键字

```java
//实例，将请求中的queryParameter的imei设为“”
RequestData.queryParameters[imei] EMPTY

```

## TESTNG 错误

### **TestNG 测试用例一个也没有运行**

以下是一些可能的问题:

Excel里面的testMethodName和实际测试方法名字有出入,需要将这两个名字统一
Excel文件格式不对,可以复制一份可以运行的excel文件,再修改里面的内容

### **TestNG 提示类型不匹配,一个测试用例都没有运行**

出现这个问题一般是因为testng的@Test下面的测试方法的参数顺序和Excel里面对应数据的顺序不一致 通过调整参数的顺序让他和数据保持一致一般可以解决此问题

### **TESTNG DataProvider 参数数量不匹配**

如下面的例子，这个错就表示，测试方法需要4个参数，但是DataProvider提供了5个

```java
org.testng.TestNGException:
The data provider is trying to pass 5 parameters but the method com.dooioo.automation.apis.ApplyAssets.SearchApplyAssetsTest#testSearchApplyAssets takes 4
```

解决办法：

修改EXCEL文件让他提供的参数和测试方法需要的是一样的，类表示一个参数，单独的字符表示一个

## API返回值的验证

目前API的返回值基本上都是JSON格式的，验证JSON的方式目前主要是通过以下几种方式：

- 期望的JSON直接写在EXCEL里面
- 构建JSON对象进行校验
- 通过SQL来比较返回值JSON和数据库值的比较

### 最简单的比较，期望的JSON直接写在EXCEL里面

> 最简单的比较，期望的JSON直接写在EXCEL里面

```java
  new SoftAssertion().assertApiResponse(api.getResponse(), statusCode, expectedBodyResult,"id");
```

最简单的比较，期望的JSON直接写在EXCEL里面， 直接通过生成的代码比较
---


###构建JSON对象进行校验

> 构建JSON文件，一个简单方式就是创建一个Map对象，将期望值放到Map里面,然后通过JsonHelper.toJSONString将
Map转化为JSON格式字符串

```java
  Map result = new HashMap();
  result.put("jsonKey1","expectedValue");
  result.put("jsonKey2","expectedValue");
  new SoftAssertion().assertApiResponse(api.getResponse(), statusCode,JSONHelper.toJSONString(result)
,"id");

```

构建JSON文件，一个简单方式就是创建一个Map对象，将期望值放到Map里面
---


### 通过SQL来比较返回值JSON和数据库值的比较

> 通过SQL来比较返回值JSON和数据库值的比较，sql选择的字段名需要和JSON里面的字段名一致

```java
  new SoftAssertion().assertDBValues("ky","select * from inquiry",JSONHelper.toBean(result,Map.class));
```

通过SQL来比较返回值JSON和数据库值的比较，sql选择的字段名需要和JSON里面的字段名一



## 实际返回值为空

如果遇到实际返回值为空的情况，需要进行调试一下，在api的assertApiResponse方法处设置断点，进行debug，
确认返回值是否有，同时需要和开发确认请求方法，参数是否正确
