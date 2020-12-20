package day01;

/*
    自增运算符：++
    自减运算符：--
    基本含义：让一个变量增加1，或者减少1
    注：++i 先自增再进行操作，i++ 先操作再加1
    -- 同理

    常量不能使用++ 或者 -- 来进行操作

    复合赋值运算符：
        +=
        -=
        *=
        /=
        %=
 */
public class DemoPerator {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(++num);
        num += 3;
        System.out.println(num);
        num -= 5;
        System.out.println(num);
        num *= 2;
        System.out.println(num);
        num /=2;
        System.out.println(num);

    }
}
