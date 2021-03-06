# JavaScript基础

概念：一门客户端脚本语言

* 运行在客户端浏览器中的，每一个浏览器都右JavaScript的解析引擎
* 脚本语言：不需要编译，直接被浏览器解析执行

功能：

* 可以用来增强用户和html页面的交互过程，可以来控制html元素，让页面有一些动态的效果，提升用户体验

ECMAScript:客户端脚本语言的标准

* 基本语法：

  * 与html结合方式

    * 内部js
      * 定义\<script> 标签体内容就是js代码
    * 外部js
      * 定义\<script> 通过src属性引入外部的js文件
    * 注意：
      * \<script> 标签可以定义在html页面的任何地方，但是定义的位置会影响执行顺序
      * \<script> 可以定义多个

  * 注释：

    1. 单行注释//
    2. 多行注释/* */

  * 数据类型

    1. 原始数据类型：(基本数据类型)：
       1. number：数字类型，整数、小数、NAN(not a number 一个不是数字的数字类型)
       2. string：字符串、使用单引号或者双引号都可以
       3. boolean：true或者false
       4. null：一个对象为空的占位符
       5. undefined：未定义，如果一个变量没有给初始化值，则会默认值为undefined
    2. 引用输入类型：(对象)

  * 变量

    * var 变量名;
    * document.write(变量名);(打印语句)
    * document.write(typeof(变量名)) 查看该变量的类型

  * 运算符

    1. 一元运算符：只有一个运算数的运算符

       1. ++ -- ，+ - （自增或自减）
       2. ++ -- （在前时，先自增或自减，再运算，同理，再后时，先运算，再自增或自减
       3. 注意：在js中，如果运算数不是运算符所要求的类型，那么js引擎会自动将运算数进行类型转换
          1. 其他类型转number：
          2. string转number：按照字面值转换，如果字面值不是数字，则转为NAN(不是数字的数字)
          3. Boolean转number：true转为1，false转为0

    2. 算数运算符

       1. \+ \- % \ 

    3. 赋值运算符

       1. = += -= 

    4. 比较运算符

       1. \< \> \>= \<= ===(全等于)
       2. 比较方式：
          1. 类型相同：直接比较
             * 字符串：按照字典顺序比较，按位逐一比较，直到得出大小为止
          2. 类型不同：先进行类型转换，再比较
             * ===全等于，再比较之前，先判断类型，如果类型不一样，则直接返回false

    5. 逻辑运算符

       1. &&  ||  (短路) 
       2. !：
       3. 其他类型转boolean
          1. number：0或NAN为假，非0为真
          2. string：除了空字符串，其他都是ture
          3. null undefined：都是false
          4. 对象：所有对象都为true

    6. 三元运算符

       1. ?:

          语法：表达式? 值1：值2；

          判断表达式的值，如果是true则取值1，如果是false则取值2

  * 流程控制语句

    1. if...else

    2. switch:

       1. 在Java中，switch语句可以接收的数据类型：byte int short char，枚举(1.5)，String()

          switch(变量)

          case值：

       2. 在js中什么类型都可以接收任意的原始数据类型

    3. while

    4. do while

    5. for

  * js特殊语法：

    1. 语句以分号结尾,如果一行只有一条语句则分号可以省略(不建议使用)
    2. 变量的定义使用var关键字，也可以不使用
       1. 用：定义的变量是局部变量
       2. 不用：定义的变量是全局变量(不建议使用)

* 基本对象：

  1. Function对象：

     ```
       Function:函数(方法)对象
         1.创建：
           1. var fun = new Function(形式参数,方法体);不常用
                   var fun1 = new function("a","b","alert(a);");
                   //调用方法
                   fun1(3,5);
           2. function 方法名称(参数列表){
                 方法体
             }
         3.属性：
           length：代表形参的个数
         4.特点：
           1.方法的定义是，形参的类型不用写,返回值类型也不写
           2.方法是一个对象，如果定义名称相同的方法，会覆盖
           3.在js中，方法的调用只与方法的名称有关，和参数列表无关
           4.在方法声明中有一个隐藏的内置对象(数组)，arguments,封装所有的实际参数
     ```

     

  2. array

     ```
       Array：数组对象
         1.创建：
           1.var arr = new Array(元素列表)
           2.var arr = new Array(默认长度)
           3.var arr = [元素列表]
         2.方法
           join(参数)：将数组中的元素按照指定的分隔符指定的分隔符拼接为字符串
           push(参数)：数组的末尾添加一个或更多元素，并返回新的长度。
         3.属性
           length：数组的长度
         4.特点
           1.js中，数组元素的类型是可变的
           2.js中，数组的长度是可变的
     ```

  3. boolean

  4. date

     ```
     Date：时间对象
         1.创建：
             var date = new Date();
         2.方法
             toLocaleString();返回当前date对象对应的时间本地字符串格式
             getTime():获取毫秒值，返回当前日期对象描述的时间到1970年1月1日零点的毫秒值差
     ```

  5. Math

     ```
     Math：数学对象
         1.创建：
             Math对象不用创建，直接使用。Math.方法名();
         2.方法
             Math.random();返回一个0~1之间的随机数，含0不含1
             floor(x)：对数字进行向下取整
             ceil(x)：对数字进行向上取整
             round(x)：四舍五入
         3.属性
             PI
     ```

     

  6. number

  7. String

  8. EegExp：正则表达式对象

     1. 正则表达式：定义字符串的组成规则

        1. 单个字符：[]

           如：[a] \[ab]\[a-z A-Z-0-9]

           特殊符号代表特殊含义的单个字符

           /d:单个数字字符[0-9]

           \\w:单个单词字符[a-zA-Z0-9_]

        2. 量词符号：

           \*：出现0次或多次

           ?：出现0次或1次

           +：出现1次或多次

           {m,n}：表示 m<=数量 <=n

           ​	m如果缺省：{,n}：最多n次

           ​	n如果缺省：{m,}：最少m次

        3. 开始结束符号

           ^：开始

           $：结尾

     2. 正则对象：

        1. 创建：

           ```
           var reg = new RegExp("正则表达式")
           var reg = /正则表达式/;
           ```

        2. 方法：

           test(参数)：验证指定的字符串是否符合正则定义的规范

  9. global

     1. 特点：全局对象，这个Globe中封装的方法不需要对象就可以直接调用，方法名();

     2. 方法：

        1. encodeURL()：url编码

        2. decodeURL()：url解码

        3. encodeURLComponent()：url编码，编码的字符更多

        4. decodeURLComponent()：url解码

        5. parseInt():将字符串转换为数字

           逐一判断每一个字符是否是数字，直到不是数字为止，将前边的数字部分转为number

        6. isNaN()：判断一个值是否是NaN

           NaN参与的==比较其全部为false

        7. eval()：将JavaScript字符串，转换为脚本来进行执行

     3. url编码：

        张飞绣花：%E5%BC%A0%E9%A3%9E%E7%BB%A3%E8%8A%B1

        

BOM

DOM

