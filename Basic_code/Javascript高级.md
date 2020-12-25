# JavaScript高级

## ECMAScript

## BOM

* 概念:Browser Object Model 浏览器对象模型

  * 将浏览器的各个组成部分封装为对象

* 组成:

  * window:窗口对象

    1. 创建对象

    2. 方法

       1. 与弹出框有关的方法:

          1. alter()显示待右一段消息和确认按钮的警告框
          2. confirm() 显示带有一段消息以及确认按钮和取消按钮的对话框
             1. 如果用户点击确定按钮,则方法返回true
             2. 如果用户点击取消按钮,则返回flase
          3. prompt() 显示可提示用户输入的对话框

       2. 与打开关闭有关的方法

          1. open()打开一个新的对象

             返回新的windwo对象

          2. close()关闭浏览器窗口

             谁调用,就关掉谁

       3. 与定时器有关的方法(以毫秒为计数单位)

          1. setTimeout() 在指定的毫秒数后调用函数或计算表达式
             1. 参数:
                1. js代码或者方法对象
                2. 毫秒值
             2. 返回值:唯一标识,用于取消定时器
          2. clearTimeout() 取消settimeout方法设置的settimeout
          3. setInterval() 按照指定的周期来调用函数或计算表达式
          4. clearInterval() 取消setInterval方法设置的timeout

    3. 属性

       1. 获取其他的BOM对象
          1. history
          2. location
          3. Navigator
          4. Screen
       2. 获取DOM对象
          1. document

    4. 特点:

       window对象不需要创建,可以直接使用

       window引用可以省略,方法名()

  * navigator:浏览器对象

  * Screen:显示器屏幕对象

  * history:历史记录对象

    1. 创建(获取)

       1. window.history
       2. history

    2. 方法

       1. back() 加载history列表中的上一个

       2. forward()加载history列表中的下一个

       3. go()  加载history列表中的某个具体页面

          参数:

          ​	整数:前进几个历史记录

          ​	负数:后退几个历史记录

    3. 属性

       length 返回当前窗口历史列表中的url记录

  * location:地址栏对象

    1. 创建(获取)
       1. windows.location
       2. location
    2. 方法:
       1. reload() 重新加载当前文档
    3. 属性:
       1. href 设置或返回完整的url

## DOM

* 功能：控制html文档内容
* 代码：获取页面的标签(元素)
  * document.getElementById("id值"):通过元素的id获取元素对象
* 操作Element对象:
  * 修改属性值:
    1. 明确获取的对象是哪一个?
    2. 查看API文档,找其他有哪些所属性可以设置
  * 修改标签体的内容
    * 属性:innerHTML
      1. 获取元素对学校
      2. 使用 innerHTML属性修改标签体内容

### 事件简单学习

概念:Doucument Object Model 文档记录模型

​	将标记语言文档的各个组成部分,封装为对象,可以使用这些对象,对标记语言进行CRUD的动态操作

* 功能:某些组件被执行了某些操作后,触发某些代码的执行
* 绑定事件:直接在html标签上,指定事件的属性,属性值就是js代码
  * 事件:onclick---单击事件
  * 通过js获取元素对象,指定事件属性,设置一个函数
* 核心DOM:针对任何结构化文档的标准模型
  * Document:文档对象
  * Element:元素对象
  * Attribute:属性对象
  * Text:文本对象
  * Comment:注释对象
  * Node:节点对象,其他5个节点的父对象
* XML DOM:针对XML文档的标准模型
* HTML DOM:针对HTML文档的标准模型

### 核心DOM模型:

#### Document:文档对象

1. 创建(获取):在html dom 模型中,可以使用window对象来获取
   1. window.document
   2. document
2. 方法:
   1. 获取Element对象:
      1. getElementById() :根据id属性值来获取元素对象,id属性值一般情况下唯一
      2. getElementsByTagName():根据元素名称获取元素对象们,返回值是一个数组
      3. getElementsByClassName():根据class属性值获取元素对象们,返回值是一个数组
      4. getElementsByName():根据name属性值获取对象们,返回值是一个数组
   2. 创建其他的DOM对象:
      1. createAttribute(name)	创建拥有指定名称的属性节点，并返回新的 Attr 对象
      2. createComment()	创建注释节点。
      3. createElement()	创建元素节点。
      4. createTextNode()	创建文本节点。
3. 属性:

#### Element:元素对象

1. 获取:通过document来获取和创建
2. 方法:
   1. removeAttribute():删除属性
   2. setAttribute:设置属性

#### Node:节点对象,其他5个节点的父对象

* 特点:所有DOM对象都可以被认为是一个节点
* 方法:
  * CRUD DOM数
  * appendChild()	向节点的子节点列表的结尾添加新的子节点。
  * removeChild()	删除（并返回）当前节点的指定子节点。
  * replaceChild()	用新节点替换一个子节点。
* 属性:
  * parentNode	返回节点的父节点。

### HTML DOM

1. 标签体的设置和获取:innerHTML
2. 使用html元素对象的属性
3. 控制样式

## 事件监听机制

概念:某些组件被执行了某些操作后,触发某些执行代码的执行

1. 事件,某些操作,如:单击,双击,键盘按下,鼠标移动
2. 事件源:组件 如:按钮 文本输入框...
3. 监听器:代码.
4. 注册监听:将事件,事件源,监听器,结合在一起. 当事件源上发生了某个事件则触发执行某个监听器代码

### 常见的事件

1. 点击事件:
   1. onclick:单击事件
   2. ondblclick:双击事件
2. 焦点事件:
   1. onblur:失去焦点
      1. 一般用于表单验证
   2. onfocus:元素获得焦点
3. 加载事件
   1. onload:一张页面或一幅图完成加载
4. 鼠标事件
   1. onmousedown 鼠标按钮被按下
      1. 定义方法时:定义一个形参,接收event对象
      2. event对象button属性可以获取鼠标按钮被点击了
   2. onmouseup 鼠标按键被松开
   3. onmousemove 鼠标被移动
   4. onmouseout 鼠标从某个元素上移开
   5. onmouseover 鼠标移到某个元素上
5. 键盘事件
   1. onkeydown 某个键盘被松开
   2. onkeyup 某个按键被松开
   3. onkeypress 某个键盘按键被按下并松开
6. 选中和改变
   1. onchange 域的内容被改变
   2. onselect 文本被选中
7. 表单事件
   1. onsubmit 确认按钮被点击
      1. 可以阻止表单的提交
      2. 方法返回false则表单被阻止提交
   2. onreset 重置按钮被点击