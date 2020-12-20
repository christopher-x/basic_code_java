package day02;
/*
    break关键字常见用法：
        switch语句中，一旦执行，整个switch语句立刻结束
        循环语句中，使用break会直接将整个循环语句结束
 */
public class DemoBreak {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a ++){
            if (a == 3){
                System.out.println("来啦来啦");
                break;
            }
            System.out.println("当前的数字为："+a);
        }
    }
}