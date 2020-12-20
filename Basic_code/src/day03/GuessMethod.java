package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessMethod {
    public static void main(String[] args) {
        //创建一个Random对象
        Random r = new Random();
        //创建生成随机数对象
        int randomNum = r.nextInt(10000) + 1;
        System.out.println(randomNum);
        //键盘输入
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i <= 10;i ++){
            System.out.print("请输入你要猜测的数字:");
            int guessRandom = sc.nextInt();
            if (guessRandom > randomNum){
                System.out.println("数字大了,请重新输入");
            }else if (guessRandom < randomNum){
                System.out.println("数字猜小了,请重新输入");
            }else if(guessRandom == randomNum) {
                System.out.println("正确,游戏结束");
                System.out.println("你还有"+(10 - i )+"次机会");
                break;
            }else{
                break;
            }
        }
        System.out.println("系统生成的数字为："+randomNum);
    }
}