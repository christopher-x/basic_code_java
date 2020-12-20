package day02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务，就是有参数
例如两个数字相加，必须知道两个数字各自多少，才能相加

无参数，小括号当中留空，一个方法不需要任何数据条件，自己能独立完成任务，就是无参数
例如一个方法，打印固定的10次helloworld
 */
public class DemoMethodParam {
    public static void main(String[] args) {
        method1(30,50);
        print1();
    }
    public static void method1(int a ,int b ){
        int result = a * b;
        System.out.println(result);
    }
    public static void print1(){
        System.out.println("无参数方法");
    }
}
