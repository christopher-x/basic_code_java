package day02;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = nc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = nc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = nc.nextInt();
        int temp = 0;
        if (a > b && a > c){
            System.out.println("当前值最大为"+a);
        }else if (b > a && b > c){
            System.out.println("当前最大值为："+b);
        }else{
            System.out.println("当前最大值为:"+c);
        }
    }
}
