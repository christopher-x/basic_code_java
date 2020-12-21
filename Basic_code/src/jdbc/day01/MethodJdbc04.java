package jdbc.day01;

import java.sql.*;

public class MethodJdbc04 {
    public static void main(String[] args) {
        //
        Statement statement = null;
        Connection connection = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.定义sql语句
            String sql1 = "select * from account";
            try {
                // 3.创建连接对象
                connection = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false&serverTimezone=UTC", "root", "admin");
                // 4.获取执行sql对象
                statement = connection.createStatement();
                // 5.执行sql
                ResultSet resultSet = statement.executeQuery(sql1);
                // 6.处理结果
                // 6.1 让游标向下移动一行
                resultSet.next();
                // 循环判断游标是否是最后一行末尾
                while (resultSet.next()) {
                    // 6.2 获取数据
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString("name");
                    double aDouble = resultSet.getDouble(3);
                    System.out.println(id + "-----" + name + "-----" + aDouble);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
