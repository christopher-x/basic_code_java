package day02;

/*
while:
    初始化语句：
    while(条件判断){
        循环体
    }
 */

public class DemoWhile {
    public static void main(String[] args) {
        int a = 1;
        while(a < 10){
            System.out.println(a);
            a = a++;
        }
    }
}
