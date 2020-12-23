package jdbc.day01.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
c3p0的演示
 */
public class C3p0Demo1 {
    public static void main(String[] args) {
        //1. 创建数据库连接池
        DataSource ds = new ComboPooledDataSource();
        try {
            //获取连接对象
            for (int i = 0; i < 20; i++) {
                Connection conn = ds.getConnection();
                System.out.println(conn+"="+i);
                if(i == 5){
                    conn.close();//归还连接到连接池中
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
