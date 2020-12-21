package jdbc.day01.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*
druid演示
 */
public class DruidMethod {
    public static void main(String[] args) throws Exception {
        //导入jar包
        //创建对象
        System.out.println("创建对象");
        Properties pro = new Properties();
        //加载配置文件
        System.out.println("加载配置文件");
        InputStream is = DruidMethod.class.getResourceAsStream("/druid.properties");
        pro.load(is);
        //获取连接池对象
        System.out.println("获取连接池对象");
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        System.out.println("获取连接");
        Connection connection = ds.getConnection();
        System.out.println(connection);

    }
}
