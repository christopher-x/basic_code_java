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

* 功能:某些组件被执行了某些操作后,触发某些代码的执行
* 绑定事件:直接在html标签上,指定事件的属性,属性值就是js代码
  * 事件:onclick---单击事件
  * 通过js获取元素对象,指定事件属性,设置一个函数