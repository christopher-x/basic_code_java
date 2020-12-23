package jdbc.day02.jdbctemplate;

import jdbc.day01.druid.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

public class JdbcTemplateMethod01 {

    private JdbcTemplate jtl = new JdbcTemplate(JDBCUtils.getDataSource());
    public static void main(String[] args) {
        //导入jar包
        //创建对象
        JdbcTemplate jtl = new JdbcTemplate(JDBCUtils.getDataSource());
        //创建sql语句
        String sql="insert into account values(null,?,?)";
        //调用方法
        int update = jtl.update(sql, "王麻子",230);
        System.out.println(update);
    }
    @Test
    public void test(){
        String sql = "delete from account where id =?";
        int update = jtl.update(sql, 13);
        System.out.println(update);
    }

    @Test
    public void test2(){
        String sql = "insert into account values(?,?,?)";
        int q66 = jtl.update(sql, null, "赵六啊", 3000);
        System.out.println(q66);
    }

    @Test
    public void test3(){
        //注意：此方法的查询结果的长度只能是1
        String sql = "select * from account ";
        List<Map<String, Object>> maps = jtl.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
    @Test
    public void test4(){
        String sql = "select count(id) from account";
        Long aLong = jtl.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }
}
