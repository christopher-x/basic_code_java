# css:页面美化和布局控制

1. 概念：cascading style sheets 层叠样式表

   * 层叠：多个样式可以作用再同一个html元素上，同时生效

2. 好处：

   1. 功能强大
   2. 将内容展示和样式控制分离
      1. 降低耦合度
      2. 让分工协作更容易
      3. 提高开发效率

3. css的使用：

   1. 内联样式----当前标签内生效
   2. 内部样式-----当前页生效
   3. 外部样式----使用link来进行引用外部css资源文件

4. css语法：

   ```
   格式：
   	选择器{
   		属性名：属性值;
   		属性名：属性值;
   		属性名：属性值;
   		...
   	}
   选择器：筛选具有相似特诊的元素
   注意:
   	每一对属性需要使用分号;隔开，最后一对可以省略分号
   ```

5. 选择器：

   1. 分类：

      1. 基本选择器

         1. id选择器：选择具体的id属性值的元素

            1. #id属性值{}

         2. 元素选择器

            1. 语法：标签名称{}
            2. 注意：id选择器优先级更高

         3. 类选择器

            1. 选择具有相同class属性值的元素

               语法：.class属性值{}

            2. 类选择器的优先级高于元素选择器

         4. 扩展选择器

            1. 选择所有元素

               语法：*{}

            2. 并集选择器

               语法：选择器1,选择器2{}

            3. 子选择器：筛选选择器1元素下的选择器2元素

               语法：选择器1 选择器2{} 

            4. 父选择器：筛选选择器2的父元素选择器1

               语法： 选择器1 < 选择器2{}

            5. 属性选择器：选择元素名称，属性名=属性值的元素

               语法：元素名称[属性名="属性值"]{}

            6. 伪类选择器：选择一些元素所具有的状态

               语法：元素：状态{}

               如：\<a>

               ​	状态：

               ​		link：初始化的状态

               ​		visited：访问过的状态

               ​		active：正在访问的状态

               ​		hover:鼠标悬浮状态

6. 属性：

   1. 字体、文本
      1. font-size：字体大小
      2. color：文本颜色
      3. linehight：文字行高
      4. text-align：对齐方式
   2. 背景
      1. background:设置背景颜色，背景图片
   3. 边框
      1. border ：设置边框，复合属性
   4. 尺寸
      1. width：宽度
      2. height：高度
   5. 盒子模型：控制布局
      1. margin：外边距
      2. padding：内边距
         1. 默认情况下内边距会影响整个盒子的大小
         2. box-sizing：border-box；设置盒子的属性，让width和hight就是盒子最终的大小
      3. float：浮动
         1. left：左浮动
         2. right：右浮动