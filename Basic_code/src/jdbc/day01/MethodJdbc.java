package jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MethodJdbc {
    public static void main(String[] args) throws Exception {
        // 导入驱动jar包
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/test/ useSSL=false&serverTimezone=UTC";

        // 获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC","root","admin");
        //定义SQL语句
        String sql = "update account set balance = 300 ";
        String sql1 ="insert into account(name,balance)values('zhangfei',22)";
        String sql2 = "delete from account where id=4";
        //获取执行SQL对象
        Statement statement = connection.createStatement();
        //执行sql
        int i = statement.executeUpdate(sql1);
        int i1 = statement.executeUpdate(sql);
        int i2 = statement.executeUpdate(sql2);
        //处理结果
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        //释放资源
        statement.close();
        connection.close();
    }
}
