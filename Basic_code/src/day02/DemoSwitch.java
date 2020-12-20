package day02;

/*
switch
    每一个case条件都必须要加上break语句，否则会造成case穿透
    switch后面小括号当中只能是下列数据类型：
        基本数据类型：byte/short/char/int
        引用数据类型：String字符串，enum枚举
 */
public class DemoSwitch {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 1 :
                System.out.println("今天周一");
                break;
            case 2 :
                System.out.println("今天周二");
                break;
            case 3 :
                System.out.println("今天周三");
                break;
            case 4 :
                System.out.println("今天周四");
                break;
            case 5 :
                System.out.println("今天周五");
                break;
            case 6 :
                System.out.println("今天周六");
                break;
            default:
                System.out.println("输入错误，滚");
                break;

        }
    }
}
