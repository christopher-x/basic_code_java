package day02;
/*
求出100之内的偶数
 */
public class TestLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int x = 0; x <= 100; x++){
            if (x % 2 ==0) {
                sum += x;
                System.out.println("当前的和为"+sum);
            }
        }

        int y = 0;
        int sum1 = 0;
        while(y <= 100){
            if(y % 2 == 0){
                sum1 += y;
                System.out.println("while当前的和为："+sum1);
            }
            y++;
        }

        int a = 0;
        int sum2 = 0;
        do{
            if(a % 2 == 0){
                sum2 += a;
                System.out.println("do while的当前和为："+sum2);
            }
            a++;
        }
        while(a <= 100);
    }
}