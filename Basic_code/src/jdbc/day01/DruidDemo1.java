package jdbc.day01;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import lombok.val;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DruidDemo1 {
    public static void main(String[] args) {
        String sql = "insert into account values(null,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //创建Properties对象，用于加载配置文件
            Properties pro = new Properties();
            //加载配置文件
            pro.load(DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取数据库连接池对象
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
            //获取数据库连接对象
            conn = ds.getConnection();
            //获取statement,使用prepareStatement，防止sql注入
            pstmt = conn.prepareStatement(sql);
            //注入sql参数（sql中？将被替换）
            pstmt.setString(1,"张三");
            pstmt.setDouble(2,3000);
            //执行sql，返回数据集
            lombok.val resultSet = (val) pstmt.executeQuery();
            //数据处理
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放stmt
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //conn归还连接池
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
