package day01;
/*
    运算符：进行特定操作的符号，例如：加减乘除
    表达式：用运算符连起来的式子叫做表达式，例如a+b
    四则运算：+ - * /
 */
public class DemoOperator {
    public static void main(String[] args) {
        //两个常量之间可以进行数学运算
        System.out.println(20+30);

        //两个变量之间也可以进行数学运算
        int a = 10;
        int b = 20;
        System.out.println(a-b);

        //变量和常量之间可以混合使用
        System.out.println(a * 10);
        int x = 10;
        int y = 3;
        int result = x / y; //只看商，不看余数
        int result1 = x % y; //取余数
        System.out.println(result);
        System.out.println(result1);
    }
}
/*
    加号"+"常见的三种用法：
    1：对于数值来讲，加法运算
    2：对于字符char类型来说，在计算之前会提升为int，然后在计算
    3：对于String（首字母大写，并不是关键字）来说，加号代表连接字符串
        任何数据类型跟String相加，都会变成String类型来进行连接
 */
