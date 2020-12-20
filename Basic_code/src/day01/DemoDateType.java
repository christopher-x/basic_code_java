package day01;

/*
    自动类型转换：
        特点：代码不需要进行特殊处理，自动转换
        规则：范围从小到大
    强制类型转换：
        代码进行特殊的格式处理
        强制类型转换一般不推荐使用，因为有可能发生精度损失，数据溢出
        byte/short/char这三种类型都可以发生数学运算（首先提升为int类型）

    boolean不能发生类型转换
 */
public class DemoDateType {
    public static void main(String[] args) {
        System.out.println(1024);//整数，默认为int
        System.out.println(3.4);//浮点数，默认为double

        long num1 = 10000L;
        System.out.println(num1);
        //long > 转int，会丢失精度
        int num = (int) 6000000000000L;
        System.out.println(num);
        //double转int，小数点后的数字都会被舍弃
        int num2 = (int)3.5;
        System.out.println(num2);


        //A字符在ASCII码中的为数字65
        char zifu = 'A';
        System.out.println(zifu+1);

        byte a = 1;
        byte b = 22;

        int result =  (a + b); // 或者强制转换为byte来进行运算
        byte result1 = (byte)(a +b);
        //int 强制转换为short
        short result2 = (short)(a + b);
        System.out.println(result2);
    }
}
