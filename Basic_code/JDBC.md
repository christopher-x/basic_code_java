# jdbc
1. 概念：

* java Database Connectivity java数据库连接，Java语言操作数据库
* **用于操作所有关系型数据库** 
* jdbc本质：其实就是官方（sum公司）定义的一套操作所有关系型数据库的规则（接口），各个数据库厂商去实现这套接口，提供数据库驱动jar包，我们可以使用这套接口来进行编程，真正执行的代码是驱动jar包中的实现类

2. 快速入门：
   1. 导入jar包
   2. 注册驱动
   3. 获取数据库连接对象 Connection
   4. 定义sql语句
   5. 获取执行sql语句的对象 Statement
   6. 执行SQL，接收返回的结果
   7. 处理结果

   ```java
           // 导入驱动jar包
           // 注册驱动
           Class.forName("com.mysql.cj.jdbc.Driver");  
           // 获取数据库链接对象
   		Connection connection = 				DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC","root","admin");//设置时区
           //定义SQL语句
           String sql = "update account set balance = 500 where id = 1";
           //获取执行SQL对象
           Statement statement = connection.createStatement();
           //执行sql
           int i = statement.executeUpdate(sql);
           //处理结果
           System.out.println(i);
           //释放资源
           statement.close();
           connection.close();
   ```

3. 详解对象

   1. DriverManage：驱动管理对象
      1. 注册驱动：告诉程序该使用哪一个数据库驱动jar
         1. mysql5之后的驱动jar包可以省略注册驱动的步骤
      2. 获取数据库连接
         1. 方法：static Connection getConnection(String url,String username ,String password);
         2. 参数：
            1. url：指定连接的路径
               * jdbc:mysql://IP地址(域名):端口号/数据库名称
               * 例：jdbc:mysql:127.0.0.1:3306/stu
               * 注：如果连接的是本机的mysql服务器，并且mysql服务默认是3306，则url可以简写为：jdbc:mysql:///数据库名称
            2. user：用户名
            3. password：密码
   2. Connection：数据库连接对象
      1. 功能：
         * 获取执行sql对象
           * Statement createStatement()
           * PreparedStatement prepareStatement(String sql)
         * 管理事务
           * 开启事务：setAutoCommit(boolean autoCommit)：调用该方法设置参数为false，即开启事务
           * 提交事务：commit();
           * 回滚事务：rollback();
   3. Statement：执行sql对象
      1. 执行sql
         1. boolean execute(String sql) :可以执行任意类型的sql(了解)
         2. int executeUpdate(String sql) 执行DML(增删改 update insert delect ) 语句 DDL(create,alter,drop) 语句
            * 返回值：影响的行数，可以通过影响的行数判断DML语句是否执行成功，返回值>0则执行成功，否则执行失败
         3. ResultSet executeQuery(String sql) ：执行DQL(select) 语句
   4. ResultSet：结果集对象，封装查询结果
      1. next() : 游标向下移动一行
      2. getXXX：获取数据
         * XXX代表获取的数据类型，如int getInt()，String getString()
         * 参数：
           * int：代表列的编号，从1开始，getString(1)
           * String：代表列名称，如：getDouble("balance");
         * 注意：
           * 使用步骤：
             * 游标向下移动一行
             * 判断是否有数据
             * 判断数据
   5. PreparedStatement：执行SQL的对象

## 抽取JDBC工具类：JDBCUtils

**目的：简化书写：**

分析：

	1. 注册驱动抽取
 	2. 抽取一个方法获取连接对象
     * 需求：不想传递参数（麻烦），还得保证工具类的通用性
     * 解决方案：配置文件
 	3. 抽取一个方法释放资源