package jdbc.day01.userLogin;

import jdbc.day01.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MethodLogin {
    public static void main(String[] args) {
        //1.键盘输入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        //2.调用方法
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        boolean flag = new MethodLogin(). login(username,password);
        if (flag){
            System.out.println("登录成功!!!");
        }else {
            System.out.println("用户名或密码错误！！！");
        }
    }
    /*
    登录方法
     */
    public boolean login(String username, String password) {
        if (username == null && password == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //连接数据库判断是否登录成功
        try {
            //获取连接
            conn = JDBCUtil.getConnection();
            //创建sql语句
            String sql = "select * from user where username = '" + username + "'and password = '" + password + "'";
            //获取执行sql对象
            System.out.println(sql);
            stmt = conn.createStatement();
            //执行查询
            rs = stmt.executeQuery(sql);
            //判断
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            JDBCUtil.close(rs,stmt,conn);
        }
        return false;
    }
}
