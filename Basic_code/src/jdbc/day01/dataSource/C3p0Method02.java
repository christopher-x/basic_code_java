package jdbc.day01.dataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    c3p0演示
 */
public class C3p0Method02 {
    public static void main(String[] args) throws SQLException {
        //testNameConfig();
        //1.获取DataSource
        DataSource ds = new ComboPooledDataSource();
        for (int i = 0; i < 10; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i+":"+connection);
        }
    }
    public static void testNameConfig() throws SQLException {
        //1.1获取DataSource，使用指定名称配置
        ComboPooledDataSource other3p0 = new ComboPooledDataSource("other3p0");
        //2.获取连接

        for (int i = 0; i < 10; i++) {
            Connection connection = other3p0.getConnection();
            System.out.println(i+":"+connection);
        }
    }
}
