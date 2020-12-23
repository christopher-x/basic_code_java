package jdbc.day02.jdbctemplate;

import jdbc.day01.druid.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateMethod01 {
    public static void main(String[] args) {
        //导入jar包
        //创建对象
        JdbcTemplate jtl = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建sql语句
        String sql="update account set balance = 5000 where id =?";
        //调用方法
        int update = jtl.update(sql, 5);
        System.out.println(update);
    }
}
