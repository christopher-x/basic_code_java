package day05.Net.io;

/*
    练习：
        使用递归计算1-n之间的和
 */
public class Demo02Recurison {
    public static void main(String[] args) {
        int s = sum(20);
        System.out.println(s);
        /*
            定义一个方法，使用递归计算1-n之间的和
            11+2+3.。。。+n
            已知
                最大值：n
                最小值：1
            结束条件：
                获取到1的时候结束
             递归的目的：
                获取下一个被加的数字
         */
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return  n * sum(n-1);
    }
}
