# 数据库连接池

概念：其实就是一个容器(集合)，存放数据连接的容器

* 当系统初始化之后，容器被创建，容器中会申请一些连接对象，当用户来访问数据库时，从容器中获取连接对象，用户访问完成之后，会将连接对象归还给容器

* 好处：

  * 节约系统资源
  * 用户访问更加高效

* 实现

  * 标准接口：DataSource  javax.sql包下的

    * 方法：
      * 获取连接：getConnection()
      * 归还连接：如果连接对象Connection是从连接池中获取的，那么调用Connection.close()方法，则不会再关闭连接了，而是归还连接

  * 一般情况下我们不需要去实现它，由数据库厂商来实现

    * C3P0：数据库连接池技术

      * 步骤：
        * 导入jar包，c3p0-0.9.5.5.jar 以及mchange-commons-java-0.2.19.jar
        * 定义配置文件：
          * 名称：c3p0.properties 或者c3p0-config.xml
          * 路径：直接将文件放在src目录下即可
        * 创建核心对象 数据库连接池对象 ComboPooledDataSource
        * 获取连接：getConnection

    * Druid：数据库连接池实现技术，由阿里巴巴提供

      * 使用步骤：

        1. 导入jar包

        2. 定义配置文件

           ```XML
           driverClassName=com.mysql.cj.jdbc.Driver
           url=jdbc:mysql:///test?serverTimezone=UTC
           username=root
           password=admin
           # 初始化连接数
           initialSize=5
           # 最大连接数
           maxActive=10
           # 超时时间
           maxWait=3000
           ```

        3. 是properties

        4. 可以叫任意名称，可以放在任意目录下

        5. 获取数据库连接池对象：

           * 通过一个工厂类来获取：druidDataSourceFactory

        6. 获取连接：getConnection

           ```java
           package jdbc.day01.druid;
           
           import com.alibaba.druid.pool.DruidDataSourceFactory;
           import com.mchange.v2.c3p0.ComboPooledDataSource;
           
           import javax.sql.DataSource;
           import java.io.IOException;
           import java.io.InputStream;
           import java.sql.Connection;
           import java.util.Properties;
           
           /*
           druid 演示
            */
           public class DruidMethodTest01 {
               public static void main(String[] args) throws Exception {
                   //加载配置文件
                   Properties pro = new Properties();
                   //这个地方是个神坑！。class后面不要添加getclassreload
                   InputStream rs = DruidMethodTest01.class.getResourceAsStream("/druid.properties");
                   pro.load(rs);
                   //通过工厂类来获取数据库连接对象
                   DataSource ds = DruidDataSourceFactory.createDataSource(pro);
                   Connection conn = ds.getConnection();
                   System.out.println(conn);
               }
           }
           
           ```

           

      * 定义工具类：

        1. 定义一个类JDBCUtils
        2. 提供静态代码块加载配置文件，初始化连接池对象
        3. 提供方法
           1. 获取连接方法：通过数据库连接池获取连接
           2. 释放资源
           3. 获取连接池的方法

        ```java
        package jdbc.day01.druid.util;
        
        import javax.sql.DataSource;
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;
        
        /*
            使用新的工具类
         */
        public class DruidMethod01 {
            public static void main(String[] args) {
                /*
                完成添加操作，给Account表添加一条新记录
                 */
                Connection conn =null;
                PreparedStatement ps=null;
                DataSource ds = JDBCUtils.getDataSource();
                try {
                    //1.获取连接
                    conn = ds.getConnection();
                    //2.定义sql
                    String sql="insert into account values(null,?,?)";
                    System.out.println(conn);
                    //3.获取pst对象
                    ps = conn.prepareStatement(sql);
                    //给? 赋值
                    ps.setString(1,"张三");
                    ps.setDouble(2,3000);
                    //执行sql
                    int count = ps.executeUpdate();
                    System.out.println(count);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }finally {
                    //释放资源
                    JDBCUtils.close(ps,conn);
        
                }
            }
        }
        ```

## Spring JDBC

 Spring框架对JDBC的简单封装，提供了一个JDBCTemplate()对象简化了JDBC的开发

使用步骤：

1. 导入jar包
2. 创建jdbctemplate对象，依赖于数据源DataSource
   1. JDBCTemplate template = new JDBCTemplate(ds);
3. 调用JDBCTemplate 的方法来完成CRUD的操作
   1. update()：执行DML语句，增删改
   2. queryForMap()：查询结果将结果集封装为Map集合
   3. queryFprList()：查询结果将结果集封装为list集合
   4. query()：查询结果，将结果封装为JavaBean对象
   5. queryForObject：查询结果，将结果封装为对象

```java
package jdbc.day02.jdbctemplate;

import jdbc.day01.druid.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateMethod01 {
    public static void main(String[] args) {
        //导入jar包
        //创建对象
        JdbcTemplate jtl = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建sql语句
        String sql="update account set balance = 5000 where id =?";
        //调用方法
        int update = jtl.update(sql, 5);
        System.out.println(update);
    }
}
```

