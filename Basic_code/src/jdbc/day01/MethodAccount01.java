package jdbc.day01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MethodAccount01 {
    public static void main(String[] args) {
        MethodAccount01 methodAccount01 = new MethodAccount01();
        List<MethodAccount> all = methodAccount01.findAll();
        for (MethodAccount methodAccount : all) {
            System.out.println(methodAccount);
        }
    }
    public List<MethodAccount> findAll() {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<MethodAccount> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///test?useSSL=false&serverTimezone=UTC", "root", "admin");
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return list;
    }

}