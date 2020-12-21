package jdbc.day01.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
事务操作
 */
public class MethodMoney {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        try {
            //1.获取连接
            connection = JDBCUtil.getConnection();
            // 开启事务
            connection.setAutoCommit(false);
            //2.定义sql
            //2.1张三 -500
            String sql = "update account set balance = balance - ? where id = ?";
            //2.2里斯 +500
            String sql1 = "update account set balance = balance + ? where id = ?";
            //3.执行获取sql对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement1 = connection.prepareStatement(sql1);
            //4.设置参数
            preparedStatement.setDouble(1, 500);
            preparedStatement.setInt(2, 1);
            preparedStatement1.setDouble(1, 500);
            preparedStatement1.setInt(2, 2);
            //5.执行sql
            preparedStatement.executeUpdate();
            // 手动制造异常
            int i = 3/0;
            preparedStatement1.executeUpdate();

            // 提交事务
            connection.commit();
        } catch (Exception throwables) {
            try {
                //事务回滚
                if (connection !=null){
                    connection.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(preparedStatement, connection);
            JDBCUtil.close(preparedStatement1, null);
        }
    }
}