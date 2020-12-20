package day02;

/*
1-100所有数字的和
 */
public class DemoMethodSum {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println(sum);
        printing(10);
    }

    public static int getSum(){
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
        }
        return sum;
    }
    /*
    打印指定次数的helloworld
     */
    public static void printing(int a){
        //使用for循环实现
        for (int i = 0; i < a; i++) {
            System.out.println("hello,world");
        }

        //使用while循环使用
        int i = 0;
        while(i < a){
            System.out.println("11111");
            i++;
        }
    }
}
