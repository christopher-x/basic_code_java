package day03;

import java.util.Random;

/*
Random类，用来生成随机数字
1：导包 import java.util.Random;
2：创建 Random rd = new Random
3：使用 获取一个随机的int数字（范围是int所有范围，正负两种）：int num = r.nexrInt();
    获取一个随机的int数字，参数代表了范围：int num = r.nextInt(3);左闭右开空间（0~2）

 */
public class DemoRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt();
        for (int i = 0; i < 100; i++) {

            int num1 = rd.nextInt(101);
            if (num1 == 100){
                System.out.println("这是我第"+i+"次循环。当前的数字为："+num1);
                break;
            }else{
//                System.out.println("一直都没循环到100");
            }
//            System.out.println(num1);
        }
        System.out.println(num);
    }

}
