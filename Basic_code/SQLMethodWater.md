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

      * 导入jar包

      * 定义配置文件

        ```XML
        driverClassName=com.mysql.cj.jdbc.Driver
        url=jdbc:mysql://localhost:3306/test
        username=root
        password=admin
        initialSize=5
        maxActive=10
        maxWait=3000;
        ```

      * 是properties

      * 可以叫任意名称，可以放在任意目录下

      * 获取数据库连接池对象：

        * 通过一个工厂类来获取：druidDataSourceFactory

      * 获取连接：getConnection

      