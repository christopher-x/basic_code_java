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
