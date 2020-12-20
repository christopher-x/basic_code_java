package day01;

/*
    一元运算符：取反，自增，自减
    二元运算符：加法+，赋值=
    三元运算符：需要三个数据才可以进行的操作运算符

格式：
    数据类型 变量名称 = 条件判断 ？ 表达式A ： 表达式b；
注意：
    必须同时保证表达式a和表达式b都复合左侧数据类型的要求
    例：
    int result = 3 > 4 ? 2.1 : 10;
 */
public class DemoOperator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //如果a大于b，则将a的值赋值给max，否则将b赋值给max
        int max = a > b ? a : b ;
        System.out.println(max);
    }
}
