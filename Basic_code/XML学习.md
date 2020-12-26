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
       2. encoding：编码方式---告知解析引擎当前文档使用的字符集编码，默认值：ISO-8859-1
       3. standalone：是否独立
          1. 取值：
             * yes：不依赖其他文件
             * no：依赖其他文件

  * 指令

  * 标签

    1. 规则：
       * 名称可以包含字母、数字以及其他的字符 
       * 名称不能以数字或者标点符号开始 
       * 名称不能以字母 xml（或者 XML、Xml 等等）开始 
       *  名称不能包含空格 

  * 属性

    * id属性值唯一

  * 文本

    * CDATA区：在该区域中的数据会被原样展示
      * 格式：  \<![CDATA[ 数据 ]]>

  * 约束：规定xml文档的书写规则
     * 作为框架的使用者(程序员)：
         1. 能够在xml中引入约束文档
         	2. 能够简单的读懂约束文档
         	
         2. 分类
            1. DTD:一种简单的约束技术
            2. Schema:一种复杂的约束技术

    * DTD：

         * 引入dtd文档到xml文档中
              * 内部dtd：将约束规则定义在xml文档中
              * 外部dtd：将约束的规则定义在外部的dtd文件中
              * 本地：\<!DOCTYPE 根标签名 SYSTEM "dtd文件的位置">
              * 网络：\<!DOCTYPE 根标签名 PUBLIC "dtd文件名字" "dtd文件的位置URL">

    * Schema:

         * 引入：

              1. 填写xml文档的根元素
              2. 引入xsi前缀.  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              3. 引入xsd文件命名空间.  xsi:schemaLocation="http://www.itcast.cn/xml  student.xsd"
              4. 为每一个xsd约束声明一个前缀,作为标识  xmlns="http://www.itcast.cn/xml" 

              ```
              <students   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              	xmlns="http://www.itcast.cn/xml"
              	xsi:schemaLocation="http://www.itcast.cn/xml  student.xsd">
              ```

              

### 解析:

1. 操作xml文档
   1. 解析：将文档中的数据读取到内存中
   2. 写入：将内存中的数据保存到xml文档中，持久化的存储
2. 解析xml文档的方式
   1. DOM：将文档一次性的加载到内存中，在内存中形成一棵DOM树
      1. 优点：操作方便，可以对文档进行CRUD的所有操作
      2. 缺点：比较消耗内存
   2. SAX：逐行读取，基于事件驱动
      1. 优点：适用于内存较小的设备，不占内存
      2. 缺点：只能读取，不能增删改
3. xml常见的解析器：
   1. JAXP:sun公司提供的解析器，支持dom和sax两种思想
   2. DOM4J：一款非常优秀的解析器
   3. JSOUP：jsoup 是一款Java 的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jQuery的操作方法来取出和操作数据。
   4. PULL：Android操作系统内置的解析器，sax方式的。

* JSOUP：jsoup 是一款Java 的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jQuery的操作方法来取出和操作数据。

  * 快速入门：

    * 步骤：

      1. 导入jar包
      2. 获取document对象
      3. 获取对应的标签
      4. 获取数据

      ```java
      package jsoup;
      
      import org.jsoup.Jsoup;
      import org.jsoup.nodes.Document;
      import org.jsoup.nodes.Element;
      import org.jsoup.select.Elements;
      
      import java.io.File;
      import java.io.IOException;
      
      public class demo1 {
          public static void main(String[] args) throws IOException {
              //获取document对象
              //1.1 根据xml文档来获取
              //1.2获取student.xml的path
              String path = demo1.class.getClassLoader().getResource("student.xml").getPath();
              //解析xml文档,加载文档进内存,获取dom树-->document
              Document document = Jsoup.parse(new File(path), "utf-8");
              //获取元素对象 Element
              Elements name = document.getElementsByTag("name");
              System.out.println(name.size());
              //获取第一个element对象
              Element element = name.get(0);
              String text = element.text();
              System.out.println(text);
      
          }
      }
      ```

  * 对象的使用：

    1. Jsoup：工具类

       1. parse：可以解析html或xml文档，返回document
       2. parse：解析html或xml文档，返回Document
          	* parse?(File in, String charsetName)：解析xml或html文件的。
          	* parse?(String html)：解析xml或html字符串
          	* parse?(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象

    2. Document：文档对象，代表内存中的dom数

       1. 获取Element对象
          	* getElementById?(String id)：根据id属性值获取唯一的element对象
          	* getElementsByTag?(String tagName)：根据标签名称获取元素对象集合
          	* getElementsByAttribute?(String key)：根据属性名称获取元素对象集合
          	* getElementsByAttributeValue?(String key, String value)：根据对应的属性名和属性值获取	元素对象集合

    3. Elements：元素Element对象的集合，可以当作ArrayList\<Element>来使用

    4. Element：元素对象

       1. 获取子元素对象
          	* getElementById?(String id)：根据id属性值获取唯一的element对象
          	* getElementsByTag?(String tagName)：根据标签名称获取元素对象集合
          	* getElementsByAttribute?(String key)：根据属性名称获取元素对象集合
          	* getElementsByAttributeValue?(String key, String value)：根据对应的属性名和属性值获取元素对象集合

       2. 获取属性值

          1. String attr(String key)：根据属性名称获取属性值

          2. 获取文本内容
            1. String text():获取文本内容	

            * String html():获取标签体的所有内容(包括字标签的字符串内容)

    5. Node：节点对象

       * document和Element的父类

  * 快捷查询方式

    * selector：选择器

      * 使用的方法：Elements	select?(String cssQuery)
        * 语法：参考Selector类中定义的语法

    * XPATH：XPath：XPath即为XML路径语言，它是一种用来确定XML（标准通用标记语言的子集）文档中某部分位置的语言

      使用Jsoup的Xpath需要额外导入jar包。

      * 查询w3cshool参考手册，使用xpath的语法完成查询