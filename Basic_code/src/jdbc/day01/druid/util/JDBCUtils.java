package jdbc.day01.druid.util;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
    druid连接池的工具类
 */
public class JDBCUtils {
    private static DataSource ds;

    static {

        try {
            //初始化配置文件
            Properties pro = new Properties();
            //获取DataSource
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //获取连接
    public static Connection conn() throws SQLException {
        return ds.getConnection();
    }

    //关闭连接
    public static void close(Statement st, Connection conn) {
        close(null, st, conn);
    }

    //关闭连接，重写该方法
    public static void close(ResultSet rs,Statement st, Connection conn) {
        if (rs != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    /*
    获取连接池
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
