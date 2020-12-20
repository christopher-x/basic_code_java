package day02;

/*
执行流程：
    首先判断条件是否为真，为真：则进入'真'代码块
    否则进入'假' 代码块
 */
public class DemoIf {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("大家好～当前数字为偶数");
        }
        else{
            System.out.println("大家好～ 当前数字为基数");
        }
    }
}
