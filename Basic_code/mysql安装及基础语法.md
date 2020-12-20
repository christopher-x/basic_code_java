## 一、安装与入门

## 1.1 下载安装

在[MySQL官网](https://link.zhihu.com/?target=https%3A//www.mysql.com/downloads/)下载安装文件，这里选择mysql5.5版本的msi文件格式。

## 1.2 启动和关闭MySQL服务

可以在“我的电脑-管理”找到MySQL服务，对其进行启动和关闭。也可以在windows的cmd里输入“net start mysql”/“net stop mysql”来启动/关闭mysql服务。可能会碰到错误，这里是权限不足，需要修改权限。

## 1.3 登录和退出

```powershell
mysql -uroot -p -P3306 -h127.0.0.1           # 登录
mysql -hip -uroot -p #远程登录
```

“root”为mysql用户名，“3306”为端口号，“127.0.0.1”为服务器地址，回车后会提示输入密码。登录成功后就可以操作数据库了。

mysql中存在三种注释：

1. #(空格) 当前为一种注释（mysql特有
2. -- (空格) 当前为另一种注释（mysql特有
3. /* */ 当前为一种多行注释

```mysql
exit;                                        /* 退出 */
quit;                                        /* 退出 */
\q;                                          /* 退出 */
```

输入以上3个语句中任意一个即可退出MySQL。

## 1.4 MySQL语句规范

- 关键字与函数名称要大写；
- 数据库名称、表名称、字段名称全部小写；
- SQL语句必须以分号结尾。

## 1.5 创建数据库

```mysql
CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] db_name [DEFAULT] CHARACTER SET [=] charset_name;
```

另外，可以用

```mysql
SHOW {DATABASES | SCHEMAS} [LIKE 'pattern' | WHERE expr];
```

来查看当前服务器下的数据库列表。

## 1.6 修改数据库

```mysql
ALTER {DATABASE | SCHEMA} [db_name] [DEFAULT] CHARACTER SET [=] charset_name;
```

## 1.7 删除数据库

```mysql
DROP {DATABASE | SCHEMA} [IF EXISTS] db_name;
```



## 二、数据类型与操作数据表

## 2.1 数据类型

下图是MySQL的数据类型汇总。

![img](https://pic3.zhimg.com/80/v2-3c8825e5cb1b17f80f8f2c132c2b5f0e_1440w.jpg)截图自菜鸟教程

## 2.2 连接数据库

```mysql
USE db_name;                                 /* 打开数据库 */
SELECT DATABASE();                           /* 显示当前打开的数据库 */
```

## 2.3 创建数据表

```mysql
# 格式
CREATE TABLE [IF NOT EXISTS] table_name(
    column_name1 data_type1,                 /* 如果希望某字段为非空，可以加上“NOT NULL”限定 */
    column_name2 data_type2,
    ...
);

# 例
CREATE TABLE IF NOT EXISTS tb1(
    username VARCHAR(20),
    age TINYINT UNSIGNED,
    salary FLOAT(8,2) UNSIGNED
);
```

## 2.4 主键约束

每张数据表只能存在一个主键KEY，可添加“PRIMARY KEY”或“KEY”，主键默认NOT NULL。如果希望主键可自动编号，则可加上“AUTO_INCREMENT”。默认情况下，自动编号的起始值为1，自动增量也为1。

## 2.5 唯一约束

唯一约束UNIQUE KEY，也可以保证记录的唯一性，但和主键不同的是，唯一约束的字段可以为NULL，同时每张数据表可以存在多个UNIQUE KEY。

## 2.6 默认约束

默认约束DEFAULT，当插入记录时，如果没有明确为字段赋值，则系统自动赋予默认值。

## 2.7 查看数据表

```mysql
SHOW TABLES [FROM db_name] [LIKE 'pattern' | WHERE expr];      /* 查看某个数据库的数据表列表 */  
SHOW COLUMNS FROM table_name;                                  /* 查看数据表结构 */
```

## 2.8 插入记录

```mysql
INSERT [INTO] table_name [(col_name,...)] VALUES (val,...);
```

## 三、约束以及修改数据表

这里继续延伸约束的概念。

约束分为表级约束和列级约束（列级约束即只针对某一个字段），按功能划分其类型包括：

- 主键约束（PRIMARY KEY）
- 唯一约束（UNIQUE KEY）
- 非空约束（NOT NULL）
- 默认约束（DEFAULT）
- 外键约束（FOREIGN KEY）

## 3.1 外键约束

- 父表和子表必须使用相同的引擎，且引擎只能为INNODB。修改引擎可在my.ini文件中修改：default-storage-engine=INNODB；
- 外键列和参照列必须具有相似的数据类型，其中数字的长度及有无符号必须相同，而字符长度则可以不同；
- 外键列和参照列必须创建索引。参照列必须显式地创建索引，外键列没有索引，MySQL将会自动隐式地创建索引。

```mysql
# 父表
CREATE TABLE province(
    id SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,    /* 参照列 */
    pname VARCHAR(20) NOT NULL
 );

# 子表
CREATE TABLE users(
    id SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(10) NOT NULL,
    pid SMALLINT UNSIGNED,                              /* 外键列，外键列和参照列必须具有相似的数据类型 */
    FOREIGN KEY (pid) REFERENCES province (id)
 );
```

## 3.2 外键约束的参照操作

- CASCADE：父表的删除或更新操作会使得子表中匹配的行也自动进行删除或更新；
- SET NULL：父表的删除或更新操作会使得子表中的外键列为NULL，并且前提是外键列没有指定为NOT NULL；
- RESTRICT：拒绝对父表的删除或更新操作；
- NO ACTION：标准SQL关键字，在MySQL中与RESTRICT相同。

```mysql
# 例
CREATE TABLE user3(
    id SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(10) NOT NULL,
    pid SMALLINT UNSIGNED,
    FOREIGN KEY (pid) REFERENCES province (id) ON DELETE CASCADE
);
```

## 3.3 表级约束与列级约束

- 表级约束：对多个数据列建立的约束，只能在列定义后声明；
- 列级约束：对单个数据列建立的约束，可在列定义时声明，也可在列定义后声明。在实际项目中，列级约束用得更多。NOT NULL和DEFAULT约束不存在表级约束，只有列级约束。

## 3.4 修改数据表

添加列：

```mysql
# 添加单列
ALTER TABLE table_name ADD [COLUMN] col_name column_definition [FIRST | AFTER col_name];
/* 例： */ ALTER TABLE user2 ADD age TINYINT UNSIGNED NOT NULL;

# 添加多列
ALTER TABLE table_name ADD [COLUMN] (col_name column_definition,...);
/* 例： */ ALTER TABLE user2 ADD (truename VARCHAR(20) NOT NULL,salary SMALLINT UNSIGNED NOT NULL);

# 删除列
ALTER TABLE table_name DROP [COLUMN] col_name;
/* 例： */ ALTER TABLE user2 DROP salary;
```

添加约束：

```mysql
# 添加主键约束
ALTER TABLE table_name ADD [CONSTRAINT [symbol]] PRIMARY KEY [index_type] (index_col_name,...);
/* 例： */ ALTER TABLE user2 ADD CONSTRAINT PK_user5_id PRIMARY KEY(id);

# 添加唯一约束
ALTER TABLE table_name ADD [CONSTRAINT [symbol]] UNIQUE [INDEX | KEY] [index_name] [index_type] (index_col_name,...);
/* 例： */ ALTER TABLE user2 ADD UNIQUE (username);

# 添加外键约束
ALTER TABLE table_name ADD [CONSTRAINT [symbol]] FOREIGN KEY [index_name] (index_col_name,...) reference_definition;
/* 例： */ ALTER TABLE user2 ADD FOREIGN KEY (pid) REFERENCES province (id);

# 添加/删除默认约束
ALTER TABLE table_name ALTER [COLUMN] col_name {SET DEFAULT literal | DROP DEFAULT};
/* 例： */ ALTER TABLE user2 ALTER age SET DEFAULT 18;
```

删除约束：

```mysql
# 删除主键约束
ALTER TABLE table_name DROP PRIMARY KEY;
/* 例： */ ALTER TABLE user2 DROP PRIMARY KEY;

# 删除唯一约束
ALTER TABLE table_name DROP {INDEX | KEY} index_name;
/* 例： */ ALTER TABLE user2 DROP INDEX username;

# 删除外键约束
ALTER TABLE table_name DROP FOREIGN KEY fk_symbol;
/* 例： */ ALTER TABLE user5 DROP FOREIGN KEY user5_ibfk_1;      /* user5_ibfk_1为MySQL给的外键别名，可通过 SHOW CREATE TABLE table_name; 查询 */
```

修改列定义和更名数据表：

```mysql
# 修改列定义
ALTER TABLE table_name MODIFY [COLUMN] col_name column_definition [FIRST | AFTER col_name];
/* 例： */ ALTER TABLE user2 MODIFY id SMALLINT UNSIGNED NOT NULL FIRST;

# 修改列名称
ALTER TABLE table_name CHANGE [COLUMN] old_col_name new_col_name column_definition [FIRST | AFTER col_name];
/* 例： */ ALTER TABLE user2 CHANGE age userage TINYINT UNSIGNED;

# 数据表更名
ALTER TABLE table_name RENAME [TO | AS] new_table_name;  /* 或 */  RENAME TABLE table_name1 TO new_table_name1 [,table_name2 TO new_table_name2];
/* 例： */ ALTER TABLE user2 RENAME user22;              /* 或 */  RENAME TABLE user22 TO user2;
```



## 四、操作数据表中的记录

## 4.1 插入记录

```mysql
INSERT [INTO] table_name [(col_name,...)] {VALUES | VALUE} ({expr | DEFAULT},...),(...),...;
```

可插入多条记录，可用表达式（expr）赋值，可用默认值（DEFAULT）赋值。插入新记录时，如果不指定字段名，就必须把所有字段值都写入，但如果主键字段是自动自增的，那么只要在主键字段处写NULL或DEFAULT即可，但主键不能为NOT NULL。

```mysql
INSERT [INTO] table_name SET col_name = {expr | DEFAULT},...;
```

与上一种插入方式的区别是，此方式可以使用子查询（SubQuery）。

```mysql
INSERT [INTO] table_name [(col_name,...)] SELECT ...;
```

此方法可将查询结果插入到指定数据表。后面这两种方式会在5.1 INSERT...SELECT中讲解。

如果在增删改查记录时出现乱码，可使用：

```mysql
SET NAMES charset_name;
```

来修改客户端的字符编码。此操作只会更改客户端字符编码，不会修改服务器数据库的字符编码。

## 4.2 单表更新记录

```mysql
UPDATE [LOW_PRIORITY] [IGNORE] table_name SET col_name1 = {expr1 | DEFAULT} [,col_name2 = {expr2 | DEFAULT}]...[WHERE where_condition];
/* 例： */ UPDATE user2 SET age = 19 WHERE id = 2;
```

## 4.3 单表删除记录

```mysql
DELETE FROM table_name [WHERE where_condition];
/* 例： */ DELETE FROM user2 WHERE id = 3;
```

## 4.4 查询表达式

```mysql
SELECT select_expr1[,select_expr2,...]
[
    FROM table_name
    [WHERE where_condition]
    [GROUP BY {col_name | position} [ASC | DESC],...]
    [HAVING where_condition]
    [ORDER BY {col_name | expr | position} [ASC | DESC],...]
    [LIMIT {[offset,] row_count | row_count OFFSET offset}]
];
```

查询时可以用AS给需要查询的字段设置别名，那么查询结果集里将会显示别名作为字段名。

```mysql
/* 例： */ SELECT id AS userid,age AS userage FROM user2;
```

可以使用table_name.col_name的格式选择某数据表的某列。

## 4.5 GROUP BY分组

```mysql
[GROUP BY {col_name | position} [ASC | DESC],...];
/* 例： */ SELECT truename,age FROM user2 GROUP BY age ASC;
```

另外，可以用HAVING关键字进行条件分组。

```mysql
[HAVING where_condition]
/* 例： */ SELECT truename,age FROM user2 GROUP BY age ASC HAVING age >= 18;
```

有一点需要注意，HAVING后的条件字段必须出现在SELECT后所要查询的字段里，但如果HAVING后为聚合函数作为条件，则可忽略。

## 4.6 查询结果排序ORDER BY

```mysql
[ORDER BY {col_name | expr | position} [ASC | DESC],...]
```

和GROUP BY的区别在于，GROUP BY查询的结果集中会去掉重复值，而且GROUP BY有一个原则，就是SELECT后面的所有列中，没有使用聚合函数的列，必须出现在GROUP BY后面。

另外，去除重复值，一般会在查询字段前加关键词DISTINCT，以返回唯一不同的值。

```mysql
SELECT DISTINCT Company FROM Orders;
```

## 4.7 限制查询数量

```mysql
[LIMIT {[offset,] row_count | row_count OFFSET offset}]
/* 例： */ SELECT truename,age FROM user2 ORDER BY age ASC LIMIT 3,4;     /* 从查询结果中的第3行开始（从0开始计数），共返回4行 */
```

## 五、子查询与连接

```mysql
# 例：
SELECT goods_id,goods_name,goods_price FROM tdb_goods WHERE goods_price >= (SELECT AVG(goods_price) FROM tdb_goods);
```

子查询的结果作为上一层查询的条件。可使用IN()/NOT IN()、ANY()、SOME()、ALL()等操作符和比较运算符搭配使用。

```mysql
# 例：
SELECT goods_id,goods_name,goods_price FROM tdb_goods WHERE goods_price >= ANY(SELECT goods_price FROM tdb_goods WHERE goods_cate = '台式机');
```

## 5.1 INSERT...SELECT

```mysql
INSERT [INTO] table_name [(col_name,...)] SELECT ...;
/* 例： */ INSERT tdb_goods_cates (cate_name) SELECT goods_cate FROM tdb_goods GROUP BY goods_cate;
```

## 5.2 INNER JOIN内连接

```mysql
UPDATE table_name SET col_name1 = {expr1 | DEFAULT} [,col_name2 = {expr2 | DEFAULT}] ... [WHERE where_condition]
/* 例： */ UPDATE tdb_goods INNER JOIN tdb_goods_cates ON goods_cate = cate_name SET goods_cate = cate_id;
```

ON后跟着连接条件。

所谓内连接，即两张表产生交集的部分，仅显示符合连接条件的记录。

当两张表所要查询的字段名相同时，必须要给各字段加上别名，或者采用“table_name.col_name”的形式区分。

```mysql
/* 例： */
SELECT goods_id,goods_name,cate_name FROM tdb_goods INNER JOIN tdb_goods_cates ON tdb_goods.cate_id = tdb_goods_cates.cate_id;
```

## 5.3 LEFT/RIGHT [OUTER] JOIN左外连接/右外连接

显示左/右表的全部和右/左表中符合连接条件的记录。

```mysql
/* 例： */
SELECT goods_id,goods_name,cate_name FROM tdb_goods LEFT JOIN tdb_goods_cates ON tdb_goods.cate_id = tdb_goods_cates.cate_id;
```

即这个例子将显示tdb_goods表中的全部记录和tdb_goods_cates表中符合条件的记录。右表反之。

## 5.4 多表连接查询

```mysql
/* 例： */
SELECT goods_id,goods_name,cate_name,brand_name,goods_price FROM tdb_goods AS a INNER JOIN tdb_goods_cates AS b ON a.cate_id = b.cate_id INNER JOIN tdb_goods_brands AS c ON a.brand_id = c.brand_id;
```

该例子连接了三张表进行查询。

## 5.5 无限级分类表设计

使用自身连接的方式对同一个数据表进行连接查询。

```mysql
/* 例： */
SELECT s.type_id,s.type_name,p.type_name FROM tdb_goods_types AS s LEFT JOIN tdb_goods_types AS p ON s.parent_id = p.type_id;
```

数据表tdb_goods_types中记录着每种类别的名称和其父类别id（其实该父类别id就是type_id），通过自身连接的方式可查询到每种类别的名称和其对应的父类别id。

## 5.6 多表删除

```mysql
/* 例： */
DELETE t1 FROM tdb_goods AS t1 LEFT JOIN (SELECT goods_id,goods_name FROM tdb_goods GROUP BY goods_name HAVING count(goods_name) >= 2 ) AS t2  ON t1.goods_name = t2.goods_name  WHERE t1.goods_id > t2.goods_id;
```

该例子使用子查询找出需要删除的记录，将子查询结果集和本身的表外连接进行删除。



## 六、运算符和函数

## 6.1 字符函数

- CONCAT(str1, str2, ...)：字符连接；
- CONCAT_WS(separator, str1, str2, ...)：使用指定的分隔符进行字符连接；
- FORMAT(x, d)：x为某数字，d为小数位；
- LOWER(str)：将字符串转化为小写字母；
- UPPER(str)：将字符串转化为大写字母；
- LEFT(str, len)：返回指定长度的字符串的左侧部分；
- RIGHT(str, len)：返回指定长度的字符串的右侧部分；
- MID(str, pos[, len])：返回str里从pos位置开始，长度为len的字符串部分；
- SUBSTRING(str, pos, len)：返回str里从pos位置开始，长度为len的字符串部分；
- LENGTH(str)：返回字符串str的长度，空格也会一起计算长度，以字节为单位；
- LTRIM(str)：删除前导空格；
- RTRIM(str)：删除后续空格；
- TRIM([{BOTH | LEADING | TRAILING} [removed_str]] FROM str)：删除前后缀不需要的字符；
- [NOT]LIKE()：与通配符一起使用选择数据。MySQL提供两个通配符（%和_），其中，“%”用于匹配任何字符串，“_”用于匹配任何单个字符。如果需要匹配的字符本身就是通配符，可使用ESCAPE；
- REPLACE(str, old_str, new_str)：将str字符串里的old_str字符串部分替换为new_str；
- LOCATE(substr,str)：返回子符串substr在字符串str的第一个出现的位置；
- LOCATE(substr,str,pos)：返回子符串substr在字符串str，从pos处开始的第一次出现的位置。

```mysql
/* LIKE()举例： */
SELECT * FROM test WHERE first_name LIKE '%1%%' ESCAPE '1';          /* 不将“1”后的“%”认为是通配符 */
```

## 6.2 数值运算

- CEIL(x)：返回大于x的最小整数值；
- DIV：整数除法，即结果中只保留整数部分；
- FLOOR(x)：返回小于x的最大整数值；
- MOD：取余；
- POWER(x, y)：幂运算，即x的y次方；
- ROUND(x, y)：四舍五入，即将数值x四舍五入为y位小数。
- TRUNCATE(x, y)：数字截取，将数值x保留y位小数（不进行四舍五入）。

## 6.3 比较运算

- [NOT]BETWEEN...AND...：【不】在范围之内；
- [NOT]IN()：【不】在列出值范围内；
- IS[NOT]NULL：【非】空。

## 6.4 日期时间函数

- NOW()：当前日期和时间；
- DATE(date)：返回日期；
- CURDATE()：当前日期；
- CURTIME()：当前时间；
- YEAR(date)：返回date中的年份；
- MONTH(date)：返回date中的月份；
- DAY(date)：返回date的中的日；
- DATE_ADD(date, INTERVAL expr type)：日期加减。type类型可以是DAY、WEEK、MONTH、YEAR等。例：SELECT DATE_ADD('2017-11-20', INTERVAL 2 DAY);
- DATEDIFF()：返回两个日期之间的天数；
- DATE_FORMAT(date, format)：日期时间格式化。例如%d、%m、%Y等。

## 6.5 信息函数

- CONNECTION_ID()：返回数据库的连接次数；
- DATABASE()：当前数据库；
- LAST_INSERT_ID()：最后插入记录的id；
- USER()：当前用户；
- VERSION()：版本信息。

## 6.6 聚合函数

- AVG()：求平均值；
- COUNT()：计数；
- MAX()：求最大值；
- MIN()：求最小值；
- SUM()：求和。

## 6.7 加密函数

- MD5()：信息摘要算法；
- PASSWORD()：密码算法。



## 七、自定义函数

## 7.1 创建不带参数的自定义函数

```mysql
CREATE FUNCTION function_name()
RETURNS type
routine_body

/* 例： */
CREATE FUNCTION f1()
RETURNS VARCHAR(30)
RETURN DATE_FORMATE(NOW(),'%Y年%m月%d日 %H点:%i分:%s秒');
```

## 7.2 创建带有参数的自定义函数

```mysql
CREATE FUNCTION function_name(parameter1 [,parameter2,...])
RETURNS type
routine_body

/* 例： */
CREATE FUNCTION f2(num1 SMALLINT UNSIGNED, num2 SMALLINT UNSIGNED)
RETURNS FLOAT(10,2) UNSIGNED
RETURN (num1 + num2) / 2;
```

## 7.3 创建具有复合结构函数体的自定义函数

```mysql
CREATE FUNCTION function_name(parameter1 [,parameter2,...])
RETURNS type
BEGIN
routine_body
END
//

/* 例： */
CREATE FUNCTION addprovince(province_name VARCHAR(20))
RETURNS INT UNSIGNED
BEGIN
INSERT province (pname) VALUES (province_name);
RETURN LAST_INSERT_ID();
END
//
```

涉及到复合结构的自定义函数，需要用BEGIN...END来包含函数体。有一点需要说明，函数体的sql语句结尾会有“;”，系统会认为这是结束符，而停止函数创建。所以需要在创建函数时暂时修改结束符，函数创建结束后再改回来。

例如修改结束符为“//”，则应使用“DELIMITER //”语句来完成。

此外，如果有不需要再使用的函数，则可将其删除。

```mysql
DROP FUNCTION [IF EXISTS] function_name;
```

## 八、MySQL存储过程

存储过程可以返回多个值，并且为独立执行，而函数只能返回一个值。

## 8.1 创建不带参数的存储过程

```mysql
CREATE [DEFINER = {user | CURRENT_USER}] PROCEDURE sp_name ([proc_parameter[,...]])
[characteristic ...] routine_body

/* 例： */ CREATE PROCEDURE sp1() SELECT VERSION();
```

调用存储过程，用“CALL sp_name”。

## 8.2 创建带有IN类型参数的存储过程

IN：表示该参数的值必须在调用存储过程时指定，在存储过程中修改该参数的值不能被返回，为默认值。

```mysql
/* 例： */
CREATE PROCEDURE removeProvinceById(IN pid INT UNSIGNED)
BEGIN
DELETE FROM province WHERE id = pid;
END
//
```

## 8.3 创建带有IN和OUT类型参数的存储过程

OUT：该值可在存储过程内部被改变，并可返回。

```mysql
/* 例： */
CREATE PROCEDURE removeUserAndReturnUserNums(IN pid INT UNSIGNED, OUT userNums INT UNSIGNED)
BEGIN
DELETE FROM province WHERE id = pid;
SELECT count(id) FROM province INTO userNums;
END
//

CALL removeUserAndReturnUserNums(12, @nums);         /* 调用存储过程 */
SELECT @nums;                                        /* 显示OUT参数的值 */
```

调用时，OUT类型的参数用“@参数”的形式，执行成功后，再用“SELECT @参数;”输出userNums的值。

## 8.4 创建带有多个OUT类型参数的存储过程

```mysql
CREATE PROCEDURE removeUserByAgeAndReturnInfos(IN p_age SMALLINT UNSIGNED, OUT deleteUsersNum SMALLINT UNSIGNED, OUT userCounts SMALLINT UNSIGNED)
BEGIN
DELETE FROM user2 WHERE age = p_age;
SELECT ROW_COUNT() INTO deleteUsersNum;
SELECT COUNT(id) FROM user2 INTO userCounts;
END
//
```

ROW_COUNT()可以得到插入、删除或者更新的记录总数。



## 九、MySQL存储引擎

```mysql
SHOW CREATE TABLE table_name;                              /* 查看数据表的创建命令 */
```

上面的sql语句可以查看数据表的创建命令，结果会显示出某数据表的存储引擎。

MySQL的存储引擎主要有：MyISAM、InnoDB、Memory、CSV和Archive等。

![img](https://pic1.zhimg.com/80/v2-e100711e1a43da7b2b8c441c211af66c_1440w.jpg)MySQL各存储引擎特点

## 9.1 并发处理

当多个连接对记录进行修改时保证数据的一致性和完整性。

- 共享锁（读锁）：在同一时间段内，多个用户可以读取同一个资源，读取过程中数据不会发生任何变化；
- 排他锁（写锁）：在任何时候只能有一个用户写入资源，当进行写锁时会阻塞其他的读锁或者写锁操作。

## 9.2 事务处理

用于保证数据库的完整性。

特性：

- 原子性
- 一致性
- 隔离性
- 持久性

## 9.3 外键和索引

- 外键：保证数据一致性的策略；
- 索引：对数据表中的一列或多列的值进行排序的一种结构。



## 十、MySQL图形化管理工具

phpMyadmin、Navicat、MySQL Workbench。

------