package day02;

/*
定义一个方法，用来打印两个数字之和
没有返回值的方法只能使用  单独调用：方法名称(参数)；
 */
public class DemoMethodReturn {
    public static void main(String[] args) {
        /*赋值调用*/
        int result1 = (int)adding(30,600);
        double result2  = adding(30,600);
        System.out.println(result1);
        System.out.println(result2);
        //单独调用，改方法没有返回值
        adding1(600,800);
    }
    public static double adding(int a,double b){
        double result = a * b;
        return result;
    }
    public static void adding1(int a ,int b ){
        int result = a +b ;
        System.out.println("Im a Adding1"+result);
    }
}
