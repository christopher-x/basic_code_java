package jdbc.day01.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*
druid 演示
 */
public class DruidMethodTest01 {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Properties pro = new Properties();
        InputStream rs = DruidMethodTest01.class.getResourceAsStream("/druid.properties");
        pro.load(rs);
        //通过工厂类来获取数据库连接对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
