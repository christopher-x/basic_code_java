# mysql基础语法

## 操作数据库

1. 创建（create）

   ```mysql
   create database test;# 创建数据库
   create database if not exists db1; # 如果当前数据库不存在则进行创建，如果存在不进行任何操作
   create database db3 character set gbk; # 创建数据库同时进行设置字符集编码
   ```

2. 查询（Retrieve）

   ```mysql
   show databases; # 查看当前所有的数据库
   show create database mysql; # 查看当前数据库的具体信息---字符集
   ```

3. 修改（update）

   ```mysql
   alter database mysql1 character set gbk; # 设置当前某一数据库的字符集编码为gbk
   ```

4. 删除（delete）

   ```mysql
   drop database db1; # 删除某一个数据库
   drop database if exists db3; # 如果该库存在则进行删除，如果不存在则不进行任何操作
   ```

5. 使用数据库

   ```mysql
   SELECT DATABASE(); # 显示当前正在使用的库
   use mysql; # 使用某一个库
   ```

## 操作表

1. 创建（create）

   ```mysql
   create table 表名(列名1 数据类型,列名2 数据类型,列名3 数据类型...);  创建表，并创建相应的字段
   数据库类型：（常用类型
   	int:整数类型
   			age int;
   	double:小数类型(5,2)# 最多5位数，小数点后保留2位
   			score double(5,2)
   	date:日期类型，只包含年月日，yyyy-MM-dd
   	date-time:日期类型，包含年月日，时分秒 yyyy-MM-dd HH:mm:ss
   	timestamp:时间戳类型：包含年月日，时分秒 yyyy-MM-dd HH:mm:ss（如果不给该字段赋值，则默认使用当前系统时间，并自动赋值
   	varchar:字符串类型,最大20个字符
   			name varchar(20);
   
   create table student(name varchar(20),age int, score double(4,1), brithday date,insert_time timestamp);
   ```

2. 查询（Retrieve）

   ```mysql
   show tables; # 显示当前库中所有的表
   desc server; # 查询当前表的表结构
   ```

   