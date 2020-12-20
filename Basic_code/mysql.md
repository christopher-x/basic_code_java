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
   
   create table stu like student; # 创建一个跟现有的表结构一致的表
   ```

2. 查询（Retrieve）

   ```mysql
   show tables; # 显示当前库中所有的表
   desc server; # 查询当前表的表结构
   ```

3. 修改（update）

   ```mysql
   # 修改表名
   alter table 表名 rename to 新表名
   # 修改表的字符集
   show create table stu1; # 查看当前表的字符集
   alter table stu1 character set utf8;
   # 添加一列
   alter table stu1 add 新列名 varchar(2);
   # 修改列名以及类型
   alter table stu1 change 列名 新列名 varchar(3);
   alter table stu1 modify 列名 varchar(4);# 只修改当前的字符串类型，或大小
   #删除一列
   alter table 表名 drop 列名;
   ```

4. 删除（delete）

   ```mysql
   drop table stu; # 删除某一个表
   drop table if exists stu; # 如果该表存在，则进行删除操作，否则不进行任何操作
   ```

## DML：增删改表中的数据

1. 增加数据

   * insert into 表名(列名1,列名2,列名n....) values(值1,值2,值n...)

     ```mysql
     insert into student(name,age) values("zhangsan",18);
     # 如果不写列名时，会默认给所有字段进行添加
     # 除了数字类型，其他类型都需要将值使用引号来进行包裹
     ```

2. 删除数据

   ```mysql
   DELECT from 表名[where 条件]
   delete from student where name="张三";
   truncate table stu; # 删除表，并重新创建一个新表；
   ```

3. 修改数据 

   ```mysql
   update 表名 set 列名1=值1，列名2=值2 [where 条件];
   ```

   

## DQL：查询语句

1. 查询

   ```mysql
   SELECT * from student; # 查询当前表内所有的数据
   ```

   语法：

   ​	select ：字段列表

   ​	from：表名列表

   ​	where：条件列表

   ​	group by：分组字段

   ​	having：分组之后的条件

   ​	order by：排序

   ​	limit：分页限定

### 基础查询

多个字段的查询

```mysql
select * from student; # 查看当前表内的所有信息(所有字段：不推荐此写法)
select 字段1,字段2,... from 表名....;
# 如果查询所有字段，则可以使用*来替代字段列表
```

去除重复

```mysql
select distinct(去除重复) name from student; # 去除重复的结果集
```

计算列

```mysql
# 计算两个字段的和
select name,age,score,age+score from student; # 年龄+分数的和 -- 如果有一个字段的值为null，那么和值的结果也为null
select name,age,score,age+ifnull(score,0) from student; # 如果该值为空，则替换为0
```

起别名

```mysql
select name,age,score,age+ifnull(score,0) as sum from student; # 使用as来添加别名
select name,age,score,age+ifnull(score,0) sum from student; # 使用空格来添加别名
```

### 条件查询

```mysql
where 条件
< 
>
=
<=
>=
and # 查询语句两个条件之间使用and来进行连接，可以使用&&但是不推荐
select * from student where age between 20 and 30; #使用between来创建条件
select * from student where age=19 or age=22 or age = 21; # 查询多段
select * from student where age in(18,22,21);# 多段查询简写
# null值不能作为查询条件来进行查询
select * from student where is null; # 使用is来作为条件来查询
```

### 模糊查询

```mysql
占位符
_：单个任意字符
%：多个任意字符
select * from student where name like '马%'; # 查询所有马开头的名字
select * from student where name like '_云_'; # 查询名字的第二个字为云的人
select * from student where name like '%马%'; # 查询名字中带有马的名字
```

