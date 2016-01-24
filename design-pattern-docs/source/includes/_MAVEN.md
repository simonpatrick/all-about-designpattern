# MAVEN自动化项目结构的搭建

Maven 是一个项目管理和整合工具。Maven 为开发者提供了一套完整的构建生命周期框架。开发团队几乎不用花多少时间就能够自动完成工程的基础构建配置，因为 Maven 使用了一个标准的目录结构和一个默认的构建生命周期。

Maven 能够帮助开发者完成以下工作：

- 构建
- 文档生成
- 报告
- 依赖
- SCMs
- 发布
- 分发
.......

## 约定优于配置
Maven 使用约定而不是配置，意味着开发者不需要再自己创建构建过程。

预定的目录结构：

|配置项|默认值|
|--------- | -----------|
|源码|	${basedir}/src/main/java|
|资源	|${basedir}/src/main/resources|
|测试用例代码|${basedir}/src/test/java|
|测试资源|${basedir}/src/test/resources|
|编译完的class和资源文件|${basedir}/target|
|可发布的包(jar 或者war)|${basedir}/target/classes|

对比我们的项目，基本上完全按照基本的MAVEN默认配置进行的.

![img](/images/code_structure.jpg)


## MAVEN-POM 文件

> groupId 和 artifactId 在POM中的声明，一般情况下IDE中创建POM项目都会自己生成这些内容

```sh
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.dooioo.automation</groupId>
    <artifactId>automation-openapi</artifactId>
    <version>0.1-SNAPSHOT</version>
</project>
```

POM 代表工程对象模型。它是使用 Maven 工作时的基本组建，是一个 xml 文件。它被放在工程根目录下，文件命名为 pom.xml。
POM 包含了关于工程和各种配置细节的信息，Maven 使用这些信息构建工程。
在创建 POM 之前，我们首先确定工程组（groupId），及其名称（artifactId）和版本，在仓库中这些属性是工程的唯一标识。

由于我们是使用MAVEN的POM文件来管理第三方依赖的，为了让程序被更好的管理，我们一般都会給自己的项目的基础报名定义的和工程组(group id),
及其名称相一致，这样会减少第三方依赖比较可能会遇到冲突的问题. 配置的POM 文件中会描述这些内容：

## MAVEN-POM 中添加依赖的第三方包

> POM 中添加需要的需要的依赖,下例是添加了一个groupId,artifactId 是automation-common,version 是0.1-SANPSHOT的包

``` sh
<dependencies>
    <dependency>
        <groupId>com.dooioo.automation</groupId>
        <artifactId>automation-common</artifactId>
        <version>0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

添加依赖的方法如下，主要是在```<dependencies>``` 标签中添加一个```<dependency>```


## MAVEN- 常用的命令

MAVEN 管理这个项目的生命周期，说起来比较复杂，下面介绍一下我们常用的MAVEN 命令.

>mvn clean, 这个命令会清空项目编译之后生成的文件，主要在target目录里面

```sh
mvn clean
```

>mvn clean package, 这个命令主要是生成可以发布的包，后面如果带参数 -DskipTests=true，就表示忽略运行测试

```sh
mvn clean package -DskipTests=true
```

- mvn clean, 这个命令会清空项目编译之后生成的文件，主要在target目录里面
- mvn clean package, 这个命令主要是生成可以发布的包，后面如果带参数 -DskipTests=true，就表示忽略运行测试

## 自动化项目的配置

> 最原始的项目结构在SVN 上，使用如下命令可以把这个文件从svn下载，或者使用SVN工具checkout出此目录也可以.然后复制这个目录,作为自己的项目

```sh
svn checkout https://scm.dooioo.com:8443/svn/Test/automation/dooioo-automation --username=<svn用户> --password=<svn密码>
```

最原始的项目结构在SVN 上，使用如下命令可以把这个文件从svn下载，或者使用SVN工具checkout出此目录也可以.然后复制这个目录,作为自己的项目

## 修改POM的artifactId

> 修改POM文件，修改artifactId

```sh
<groupId>com.dooioo.automation</groupId>
<artifactId>automation-<你的项目名称></artifactId>
<version>0.1-SNAPSHOT</version>
```

以上介绍了一些MAVEN的基本概念，下面就讲讲在进行开始一个新的自动化项目时，需要修改或者添加的东西.
一个最原始的项目可以参考SVN的automation－empty目录.

## 添加POM依赖

> 添加自动化框架的依赖

```sh
<dependencies>
    <dependency>
        <groupId>com.dooioo.automation</groupId>
        <artifactId>automation-common</artifactId>
        <version>0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

> 如果有时需要open api 认证的函数的话，需要加入如下的依赖

```sh
<dependency>
    <groupId>com.dooioo.automation</groupId>
    <artifactId>automation-openapi</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```

添加自动化框架的依赖,如果有时需要open api 认证的函数的话，需要加入openapi的依赖,具体依赖如代码


### 获取依赖的指定地址

> MAVEN nexus 服务器指定

```sh
<repositories>
      <repository>
          <id>snapshots</id>
          <url>http://nexus.dooioo.org/nexus/content/repositories/snapshots/</url>
          <snapshots>
              <updatePolicy>always</updatePolicy>
              <enabled>true</enabled>
          </snapshots>
      </repository>
      <repository>
          <id>releases</id>
          <url>http://nexus.dooioo.org/nexus/content/repositories/releases/</url>
      </repository>
  </repositories>
```

我们的MAVEN包都是放在nexus服务器上面的，这个配置就指定了从中央服务器取依赖包


##  创建自己的项目目录和一些需要的资源文件

  * 创建基础的包：com.dooioo.automation
  * 在com.dooioo.automation下面创建包apis,flows,pages
  * 在test/resources 目录下面创建servicedescription，testcases,testngfiles目录
  * chromedriver.exe 复制到test/resources目录
  * env.properties 文件复制到test/resources目录
