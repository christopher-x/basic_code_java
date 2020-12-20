package day01;

/*

    数字和字符的对照关系表（编码表）
    ASCII表：美国信息交换标准代码
    Unicode编码表：万国码
 */
public class DemoDateTypeChar {
    public static void main(String[] args) {
        char zifu = '1';
        //在没有进行加法运算时，只会输出其本身的值
        System.out.println(zifu+1);//输出50
        System.out.println(zifu);//输出1
        char zifu1 = '1';
        System.out.println(zifu1+0);
    }
}
