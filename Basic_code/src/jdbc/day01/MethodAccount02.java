package jdbc.day01;

import jdbc.day01.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MethodAccount02 {
    public static void main(String[] args) {
        MethodAccount02 methodAccount02 = new MethodAccount02();
        List<MethodAccount> all = methodAccount02.findAll();
        for (MethodAccount methodAccount : all) {
            System.out.println(methodAccount);
        }
    }
    /*
    演示JDBC工具类
     */
    public List<MethodAccount> findAll() {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<MethodAccount> list = null;
        try {
            conn = JDBCUtil.getConnection();
            //3.定义sql
            String sql = "select * from account";
            //4.获取sql对象
            statement = conn.createStatement();
            //5.执行sql
            resultSet = statement.executeQuery(sql);
            //6.遍历结果集
            MethodAccount ma = null;
            list = new ArrayList<MethodAccount>();
            while (resultSet.next()) {
                //获取数据
                int id = resultSet.getInt("id");
                int balance = resultSet.getInt("balance");
                String name = resultSet.getString("name");
                //System.out.println(id + "===========" + name + "==========" + resultSet);
                //创建Account对象，并赋值
                ma = new MethodAccount();
                ma.setId(id);
                ma.setName(name);
                ma.setBalance(balance);
                list.add(ma);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(resultSet,statement,conn);
        }
        return list;
    }

}