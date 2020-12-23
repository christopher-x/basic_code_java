HTML

1. 概念：最基础的网页开发语言

   * **超文本标记语言**（英语：**H**yper**T**ext **M**arkup **L**anguage，简称：**HTML**）是一种用于创建[网页](https://zh.wikipedia.org/wiki/网页)的标准[标记语言](https://zh.wikipedia.org/wiki/标记语言)。HTML是一种基础技术，常与[CSS](https://zh.wikipedia.org/wiki/CSS)、[JavaScript](https://zh.wikipedia.org/wiki/JavaScript)一起被众多网站用于设计网页、网页应用程序以及移动应用程序的用户界面[[3\]](https://zh.wikipedia.org/wiki/HTML#cite_note-3)。[网页浏览器](https://zh.wikipedia.org/wiki/网页浏览器)可以读取HTML文件，并将其渲染成可视化网页。HTML描述了一个网站的结构语义随着线索的呈现，使之成为一种标记语言而非[编程语言](https://zh.wikipedia.org/wiki/编程语言)。

     [HTML元素](https://zh.wikipedia.org/wiki/HTML元素)是构建网站的基石。HTML允许嵌入图像与对象，并且可以用于创建交互式表单，它被用来结构化信息——例如标题、段落和列表等等，也可用来在一定程度上描述文档的外观和[语义](https://zh.wikipedia.org/wiki/语义)。HTML的语言形式为[尖括号](https://zh.wikipedia.org/wiki/括号)包围的HTML元素（如`<html>`），浏览器使用HTML标签和脚本来诠释网页内容，但不会将它们显示在页面上。

     HTML可以嵌入如[JavaScript](https://zh.wikipedia.org/wiki/JavaScript)的[脚本语言](https://zh.wikipedia.org/wiki/脚本语言)，它们会影响HTML网页的行为。网页浏览器也可以引用[层叠样式表](https://zh.wikipedia.org/wiki/层叠样式表)（CSS）来定义文本和其它元素的外观与布局。维护HTML和CSS标准的组织[万维网联盟](https://zh.wikipedia.org/wiki/万维网联盟)（W3C）鼓励人们使用CSS替代一些用于表现的HTML元素[[4\]](https://zh.wikipedia.org/wiki/HTML#cite_note-deprecated-4)。

   * 标记语言：

     * 由标签构成的语言<标签名称>如html,xml
     * 标记语言不是编程语言

2. 快速入门：

   1. 语法：

      1. html文档后缀名html，或者htm

      2. 标签分为

         1. 围堵标签：有开始标签和结束标签，如

            ```
            <HTML>
            </HTML>
            ```

         2. 自闭合标签：开始标签和结束标签在一起如

            ```
            </br>
            ```

         3. 标签可以嵌套：

         4. 在开始标签中可以定义属性，属性由键值对构成，值需要用引号(单双都可以)引起来

         5. html不区分大小写，建议使用小写

      3. 标签：

         1. 文件标签：构成html最基本的标签

            1. html：标识html文档的根标签
            2. head：头部标签，用于指定html文档的一些属性，引入外部的资源
            3. title：标题标签
            4. body：体标签
            5. \<!doctype html>：html中定义该文档是html文档

         2. 文本标签：和文本有关的标签

            ```
            注释：<!-- -->
            <br />或者<br> :换行标签
            <h1> to <h6> : 标题字体大小
            <p> ：段落标签
            <hr>：显示一条水平线标签
            	属性：
            		color：颜色
            		width：宽度
            		size：高度
            		align：对其方式
            			center：居中
            			lefe：左对齐
            			right：右对齐
            <b>：字体加粗
            <i>：字体斜体
            <center>：文本居中</center>
            <font>：字体标签
            	属性：
            		color：颜色
            		size：大小
            		face：字体
            	属性定义：
            		color：red,green,bule
            		rgb：(值1，值2，值3)：值得范围：0-255 如rgb(0.0.255)
            		#值1,值2,值3：值的范围：00---ff之间，如#ff00ff
            	width:(宽度)
            		数值：width="20",数值的单位，默认是px(像素)
            		数值%:占比相对于父元素的比例
            ```

         3. 图片标签：

            ```
            <img src="路径" alt="图片加载失败时显示的文字" width="高度" height="宽度">
            通常使用相对路径
            	以.开头的路径
            	./：代表当前目录 例：./image/1.jpg ----不写.默认也是当前目录
            	../:代表上一级目录
            ```

         4. 列表标签：

            1. 有序列表：

               ```
               ol
               li
               <ol type="选择排序的样式" start="从哪里开始排序">
               	<li>早上好</li>
               	<li>你好</li>
               	<li>我也好</li>
               	<li>真的好</li>		
               <ol>
               ```

            2. 无序列表：

               1. ul
               2. li

         5. 链接标签：

            ```
            <a href="http://google.com" target="_blank" >点我</a>
            target="_self" 默认值：默认在本页内跳转
            target="_blank" 新开一个标签页并展示
            
            <a href="mailto:zhangsan@gmail.com"> //点击后默认打开邮箱
            <a href="google.com"><img src="路径" alt="图片加载失败时显示的文字" width="高度" height="宽度"><a/>    点击图片跳转到某一个网址
            ```

         6. 块标签：

            ```
            <div>
            	每一个div占满一整行，块级标签
            </div>
            <span>
            	文本信息在一行展示，行内标签  内联标签
            </span>
            ```

         7. 语义化标签：

            ```
            html5中为了程序的可读性，提供了一些标签
            <header>头部标签</header>
            <footer>脚部标签</footer>
            ```

         8. 表格标签：

            ```
            <table width="宽度" border="边框" bgcolor="背景色" cellpadding="定义内容和单元格的距离" cellspacing="定义单元格之间的距离，如何指定为0，则单元格的线会合成一条" align="对其方式">定义表格</table>
            <tr>定义行
                <td>定义单元格</td>
                <td>定义单元格</td>
                <td>定义单元格</td>
            </tr>
            <tr>定义行
                <th>定义表头单元格</th>
                <th>定义表头单元格</th>
                <th>定义表头单元格</th>
            </tr>
            
            <ception>:表格标题
            <thead>：表示表格的头部分
            <tbody>：表示表格的中间部分
            <tfoot>：表示表格的脚部分
            ```

            

