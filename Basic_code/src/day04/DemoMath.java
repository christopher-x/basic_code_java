package day04;

/*
java.util.Math 数学类的工具类
常用方法：
    public static double abs(double num):获取绝对值
    public static double ceil(double num):向上取整
    public static double floor(double num):向下取整
    public static long round(double num):四舍五入
 */
public class DemoMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.15));
        System.out.println(Math.abs(-199));
        System.out.println("=============");

        //向上取整
        System.out.println(Math.ceil(22.1));
        System.out.println("=================");
        //向下取整
        System.out.println(Math.floor(23.8));
        System.out.println("=================");
        System.out.println(Math.round(23213.3123123));
        //圆周率
        System.out.println(Math.PI);
    }
}
