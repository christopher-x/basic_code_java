package jdbc.day01.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
 JDBC工具类
 */
public class JDBCUtil {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /*
        文件的读取，只需要读取一次即可拿到这些值，使用静态代码块
     */
    static {
        try {
            //读取资源文件，获取值
            //1.创建Properties集合类
            Properties pro = new Properties();
            //获取src路径下的文件的方式--->ClassLoader类加载器
//            System.out.println("我到这里了");
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
//            System.out.println("来了吗？");
            URL resource = classLoader.getResource("jdbc.properties");
//            System.out.println("来了来了");
            String path = resource.getPath();
            System.out.println(path);
            //2.加载文件
            pro.load(new FileReader(path));
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
        获取连接
        @return 连接对象
     */
    public static Connection getConnection() throws SQLException {
        //
        return DriverManager.getConnection(url,user,password);
    }

  //释放资源
    public static void close(Statement stmt,Connection conn){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
