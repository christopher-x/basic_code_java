# xml

### 概念：

* Extensible Markup Language 可扩展标记语言
  * 可扩展:标签都是自定义的
  * 功能：
    1. 存储数据
       1. 配置文件
       2. 在网络中传输
  * xml与html区别
    1. xml的标签都是自定义的、html的标签都是预定义的
    2. xml的语法严格、html语法松散
    3. xml是存储数据的、html是展示数据的

### 语法

* 基本语法：

  * xml文档的额后缀名.xml
  * xml文档的声明必须写在第一行
  * xml文档中有且只有一个根标签
  * 属性值必须使用(单双都可以)引号引起来
  * 标签必须正确的关闭
  * xml标签名称区分大小写

* 快速入门：

  ```XML
  <users>
  	<user id ="1">
  		<name>zhangsan</name>
  		<age>11</age>
  		<gender>nan</gender>
  	</user>
  	
  	<user id ="2">
  		<name>zhangsan</name>
  		<age>11</age>
  		<gender>nan</gender>
  	</user>
  </users>
  ```

* 组成部分：

  * 文档声明：
    1. 格式：\<?xml 属性列表 ?>
    2. 属性列表：
       1. version：版本号
       2. encoding：编码方式
       3. standalone：是否独立
  * 指令
  * 标签
  * 属性
  * 文本

### 解析

