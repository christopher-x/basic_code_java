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

### 排序查询

```mysql
语法：order by 子句
	order by 排序字段1 排序方式1, 排序字段2 排序方式2...;
	select * from student order by age;
排序方式：
	asc：升序排列，默认
	desc：降序排列
	select * from student order by age desc;# 降序排列
多条件排序：
	select * from student order by age asc,score asc; # 第一条件满足之后才会触发第二条件
```

### 聚合函数

```mysql
将一列数据作为一个整体，进行纵向的计算
count：计算数量
	select count(name) from student; # 计算当前列一共有多少条数据（排除了非空的数据
	select count(ifnull(age,0)) from student # 加入非空的数据
	select count(*) from student; # 计算列的个数
max：获取最大值
	select max(age) from student; # 获取最大值
min：获取最小值
	select min(age) from student; # 获取最小值
sum：求和
	select sum(age) from student;# 获取age总和
avg：计算平均数
	select avg(age) from student; # 获取age平均数
```

### 分组查询

```mysql
语法：group by 分组字段;
	select sex, avg(age) from student group by sex; # 平均年龄
    select sex, avg(age), count(id) from student group by sex; # 平均年龄
    select sex, avg(age), count(id) from student where age <18 group by sex; # 小于18岁的不参与计算
    select sex, avg(age), count(id) from student where age <18 group by sex having count(id) < 2 ; # 小于18岁的不参与计算,查询总数少于2的不显示
注意：
	分组之后查询的字段：分组字段，聚合函数
	where 和 having 的区别为：
		where 在分组之前进行限定，如果不满足条件，则不参与分组，having在分组之后进行限定，如果不满足结果，则不会被查询出来
		where 后不能跟聚合函数，having可以进行聚合函数的判断
```

### 分页查询

```mysql
语法：limit 开始的索引，每页查询的条数
	select * from student limit 0,3 # 显示三条记录,limit后第一个参数为从哪开始，第二个参数为显示多少条
	# 计算公式：开始的索引=（当前的页码-1）* 每页显示的条数
```

**limit分页的操作只存在于mysql**

## 约束

概念：对表中的数据进行限定，从而保证数据的正确性，有效性和完整性。

分类：

* 主键约束：primary key

  ```mysql
  # primary key 非空且唯一！
  # 主键：一张表只有一个字段为主键
  # 主键就是表中记录的唯一标识
  create table stu(id int primary key,name varchar(20) not null );# 设置主键
  # 删除主键
  alter table stu drop primary key;
  # 添加表之后设置主键
  alter table stu modify id int primary key;
  # 自动增长（主键）
  	概念：如果某一列是数值类型的，使用auto_increment可以来完成值的自动增长，多用于id
  create table stu(id int primary key auto_increment,name varchar(20) not null );# 设置主键,并设置自动增长
  # 删除自动增长
  alter table stu modify id int;
  # 添加自动增长
  alter table stu modify id int auto_increment;
  ```

* 非空约束：not null

  ```mysql
  # 当前列的值不能为空
  # 创建表时添加约束
  create table stu(id int not null,name varchar(20) not null); # 创建表和字段，并添加约束
  # 删除字段的非空约束
  alter table modify stu name varchar(20); # 改变当前字段的约束
  # 创建表之后添加非空约束
  alter table stu name varchar(20) not null;
  ```

* 唯一约束：unique

  ```mysql
  # 某一列的值不能重复
  create table stu(id int ,phone_number varchar(20) unique); # 创建表时进行添加唯一约束
  # 唯一约束可以有null值，但是只能有一个null值，保证唯一约束
  # 删除唯一约束
  alter table stu drop index phone_number varchar(20);
  # 创建表之后添加唯一约束
  alter table stu modify phone_number varchar(20) unique;
  ```

* 外键约束：foreign key

  ```mysql
  # 在创建表时，可以添加外键
  	语法：
  		create table 表名(
  			...
  			外键列
  			constraint 外键名称(自定义) foreign key 外键列的名称(当前表要去关联的名称) references 主表名称(主表列名称)(ps:需要关联的表以及列)
  		)
  例子：
  # 创建主表
  create table stu(id int ,name varchar(20),gender varchar(2),team int) ;
  alter table stu id int primary key auto_increment;# 设置主键并自动增长（如果不是主键没法设置自动增长
  # 创建从表
  create table emp(id int ,name varchar(20) ,constraint emp_stu_id foreign key (id) references stu(id));
  
  # 删除外键
  alter table emp drop foreign key emp_stu_id;
  
  # 添加外键
  alter table emp add constraint emp_stu_id foreign key(id) references stu(id);
  
  #级联更新-级联删除
  	语法：
  		alter table 表名 add constraint 外键名称 foreign key (外键字段名称) references 主表名称(主列表名称) on update cascade on delete cascade;
  	分类：
  		级联更新：on update cascade;
  		级联删除：on delete cascade;
  ```

## 数据库的设计

### 多表之间的关系

1. 分类：
   1. 一对一：(了解)
      * 例如：人和身份证
        * 分析：一个人只有一张身份证，一个身份证只能对应一个人
   2. 一对多：(多对一)
      * 例如：一个部门有多个员工
        * 分析：一个部门有多个员工，一个员工只能对应一个部门
   3. 多对多
      * 例如：学生和课程
        * 分析：一个学生可以有多门课程，一个课程也可以有很多学生
2. 实现关系
   1. 一对多（多对一）
      1. 例如：部门对员工
         * 实现方式：在多的一方建立外键，指向一的一方的主键
   2. 多对多
      1. 例如：学生和课程
         * 实现方式：多对多的关系实现需要借助第三张中间表，中间表至少包含两个字段，这两个字段作为第三张表的外键，分别指向两张表的主键（联合主键）
   3. 一对一（了解）
      1. 例如：人和身份证
         * 实现方式：一对一关系，可以在任意一方添加唯一外键指向另一方的主键（使用unique来进行唯一约束

### 数据库设计的范式

**概念：** 设计数据库时，需要遵循一些规范，要遵循后边的范式要求，必须先遵循前边的所有范式要求

​	**数据库规范化**，又称**正规化**、**标准化**，是[数据库](https://zh.wikipedia.org/wiki/数据库)[设计](https://zh.wikipedia.org/wiki/设计)的一系列原理和技术，以减少数据库中数据冗余，增进数据的一致性。[关系模型](https://zh.wikipedia.org/wiki/关系模型)的发明者[埃德加·科德](https://zh.wikipedia.org/wiki/埃德加·科德)最早提出这一概念，并于1970年代初定义了[第一范式](https://zh.wikipedia.org/wiki/第一范式)、[第二范式](https://zh.wikipedia.org/wiki/第二范式)和[第三范式](https://zh.wikipedia.org/wiki/第三范式)的概念，还与Raymond F. Boyce于1974年共同定义了第三范式的改进范式——[BC范式](https://zh.wikipedia.org/wiki/BC范式)。

除外还包括针对[多值依赖](https://zh.wikipedia.org/wiki/多值依赖)的[第四范式](https://zh.wikipedia.org/wiki/第四范式)，[连接依赖](https://zh.wikipedia.org/w/index.php?title=连接依赖&action=edit&redlink=1)的[第五范式](https://zh.wikipedia.org/wiki/第五范式)、[DK范式](https://zh.wikipedia.org/wiki/DK范式)和[第六范式](https://zh.wikipedia.org/wiki/第六范式)。

现在数据库设计最多满足3NF，普遍认为范式过高，虽然具有对数据关系更好的约束性，但也导致数据关系表增加而令数据库IO更易繁忙，原来交由数据库处理的关系约束现更多在数据库使用程序中完成。

分类：

1. 第一范式（1NF）

   （1NF）是[数据库正规化](https://zh.wikipedia.org/wiki/数据库正规化)所使用的[正规形式](https://zh.wikipedia.org/w/index.php?title=正規形式&action=edit&redlink=1)。第一范式是为了要排除 *重复组* 的出现，所采用的方法是要求数据库的每个列的值域都是由原子值组成；每个字段的值都只能是单一值。1971年[埃德加·科德](https://zh.wikipedia.org/wiki/埃德加·科德)提出了第一范式。

2. 第二范式（2NF）

   （2NF）是[数据库正规化](https://zh.wikipedia.org/wiki/数据库正规化)所使用的[正规形式](https://zh.wikipedia.org/w/index.php?title=正規形式&action=edit&redlink=1)。规则是要求资料表里的所有资料都要和该资料表的[键](https://zh.wikipedia.org/wiki/关系键)（主键与候选键）有[完全依赖关系](https://zh.wikipedia.org/w/index.php?title=依赖关系&action=edit&redlink=1)：每个非键属性必须独立于任意一个候选键的任意一部分属性。如果有哪些资料只和一个键的一部分有关的话，就得把它们独立出来变成另一个资料表。如果一个资料表的键只有单个字段的话，它就一定符合第二范式。

   一个资料表符合第二范式[当且仅当](https://zh.wikipedia.org/wiki/若且唯若)

   - 它符合[第一范式](https://zh.wikipedia.org/wiki/第一正規化)
   - 所有非键字段都不能是候选键非全体字段的函数

3. 第三范式（3NF）

   （3NF）是[数据库正规化](https://zh.wikipedia.org/wiki/数据库正规化)所使用的[正规形式](https://zh.wikipedia.org/w/index.php?title=正規形式&action=edit&redlink=1)，要求所有非主键属性都只和[候选键](https://zh.wikipedia.org/wiki/候选键)有相关性，也就是说非主键属性之间应该是独立无关的。

   如果再对第三范式做进一步加强就成了[BC正规化](https://zh.wikipedia.org/wiki/BC正規化)，强调的重点在于“资料间的关系是奠基在主键上、以整个主键为考量、而且除了主键之外不考虑其他因素”。

## 数据库的备份与还原

1. 命令行：
   * 语法：
     * 备份：mysqldump -uroot -p 密码  数据库名>保存的路径
     * 还原：
       * 登录数据库 mysql -uroot -p
       * 创建数据库create db1;
       * 使用数据库 use db1;
       * 执行文件，source 文件路径 source d://a.sql
2. 图形化工具

## 多表查询

* 查询语法

  * select
    * 列名列表
  * from
    * 表名列表
  * while....

  例子：select * from 表1，表2；

  **笛卡尔积：有两个集合，取这两个集合的所有组成情况**

  完成多表查询，需要消除无用的数据

* 多表查询分类

  * 内链接查询：
    1. 隐式内链接：使用where条件来消除无用的数据
       * select * from 表1,表2 where 表1.'表2id' = 表2.id;
    2. 显式内链接
       * select 字段列表 from 表1 inner join 表2 on 条件
       * 例如：[inner] 可选
         * select * from stu join stu1 on stu.'stu1.id' = stu1.'id';
         * select * from stu inner join stu1 on stu.'stu1.id' = stu1.'id';
    3. 内链接查询注意事项：
       1. 从哪些表中查询数据
       2. 条件是什么
       3. 查询哪一些字段

  * 外链接查询：

    1. 左外链接：[outer] 可选
       * 语法：select 字段列表 from 表1 left outer join 表2 on 条件;
       * 左外链接查询的是左表所有数据以及交集数据
    2. 右外链接：[outer]可选
       * 语法：select 字段列表 from 表1 right outer join 表2 on 条件;
       * 右外链接查询的是右表所有数据以及交集数据

  * 子查询：

    概念：查询中嵌套查询，称嵌套查询为子查询

    例如：查询表中年龄最大的学生，并且输出该学生的信息

    ​		select max(age) from stu; //26

    ​		select * from stu where age=26; #张三，26岁，男

    子查询不同情况：

    ​		select * from stu where age=(select max(age) from stu);

    1. 子查询的结果是单行单列的：
       * 子查询可以作为条件，使用运算符进行运算(>	>=	<	<=	=)
    2. 子查询的结果是多行单列的：
       * 子查询可以作为条件，使用运算符进行运算 in 来进行判断
    3. 子查询的结果是多行多列的：
       * 子查询可以作为一张虚拟表，来进行参与查询;

## 事务

概念：包含多个步骤的业务操作被事务管理，那么这些操作要么同时成功，要么同时失败

1. 操作：

​	开启事务：start transaction

​	回滚：rollback(出现问题时，使用rollback来进行回滚)

​	提交：commit；

​	**在没有出现任何问题时，使用commit来进行提交事务。**

​	mysql数据库中事务默认自动提交：

​		一条DML语句会自动提交一次事务

​			事务提交的两种方式：

​					自动提交：

​							任意一条DML语句都是触发自动提交事务

​					手动提交：（oracle默认为手动提交事务）

​							需要手动开启事务（start transaction），并手动开始提交事务（commit）

​	修改事务的默认提交方式：

​		查看事务的默认提交方式：select @@auto commit；-- 1代表自动提交，0代表手动提交

​		修改默认提交方式： set @@ auto commit = 0;  

2. 事务的四大特征：

* 事务是原子性的：不可分割的最小操作单位，要么同时成功，要么同时失败。
* 持久性：当事务一旦提交或者回滚，那么库中的表会进行持久性更新。
* 隔离性：多个事务之间相互独立。
* 一致性：事务操作前后，数据总量不变。

3. 事务的隔离级别

   概念：多个事务之间隔离的，相互独立的，但是如果多个事务操作同一批数据，则会引发一些问题，设置不同的隔离级别可以解决这些问题

   * 脏读：一个事务，读取到林那个一个事务中没有提交的数据
   * 不可重复读（虚读）：在同一个事务中两次读取到的数据不一样
   * 幻读：一个事务操作（dml）数据表中所有记录，另一个事务添加了一条数据，则第一个事务查询不到自己的修改

   1. read uncommitted ：读未提交
      * 产生的问题：脏读，不可重复度，幻读
   2. read committed：读已提交(Oracle默认)
      * 产生的问题：不可重复度，幻读
   3. repeatable read：可重复读(MySQL默认)
      * 产生的问题：幻读
   4. seriallzable：串行化
      * 可以解决大多数问题

   **注意：隔离级别从小到大安全性越来越高，但是效率越来越低。**

   ​	数据库查看隔离级别：

   ​		select @@tx_isolation;

   ​	数据库设置隔离级别：

   ​		set globe transaction isolation level 级别字符串（read uncommitted）

## DCL：

DDL：增删改查数据库

DML：操作增删改表中的数据

DQL：查询表中的数据

DCL：管理用户（授权）

1. 管理用户

   * 添加用户
     * create user '用户名'@'主机名' identified by '密码';
   * 删除用户
     * drop user '用户名'@'主机名'
   * 修改用户密码
     * update user set password = password('新密码') where user = '用户名';
     * set password for '用户名'@'主机名' = password('新密码');
   * 查询用户
     * use mysql;
     * select * from user;
     * 通配符：%表示可以在任意主机登录数据库
   * 忘记密码：
     * net stop mysql 停止服务（需要管理员权限）
     * 使用无验证方式启动mysql服务
       * mysqld --skip-grant-tables
       * 直接输入mysql
       * use mysql;
       * update user set password = password('new passwrod') where user = 'username';
       * 关闭cmd窗口
       * 手动结束mysqld.exe进程
       * 启动mysql服务(net start mysql)
       * 使用新密码登录

2. 授权

   * 查询权限：

     * show grants for '用户名'@'主机名';

   * 授予权限

     * grant 权限列表 on 数据库.表名 to  '用户名'@'主机名';

     * grant select,delete,update on test.stu to "zhangsan"@"%"  （设置多个权限）

       ```mysql
       grant all on *.* to "zhangsan"@'%'; # 设置全部权限
       ```

   * 撤销权限

     * revoke  权限列表 on 数据库.表名 from  '用户名'@'主机名';

       ```mysql
       revoke select on test.stu to "zhangsan"@"%"   # 取消查询权限
       ```

       