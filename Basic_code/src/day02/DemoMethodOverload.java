package day02;
/*
方法的重载:
    方法的名称相同，但是参数列表不同
    参数个数不同
    参数类型不同
注意：
    参数名称不同不构成重载
 */
public class DemoMethodOverload {
    public static void main(String[] args) {
        short a = 10;
        short b = '1';
        System.out.println(sum(a,b));
        System.out.println(sum(a,20));
    }

    public static boolean sum(byte a ,byte b ){
        System.out.println("this is byte");
        return a == b;
    }

    public static boolean sum(short a ,short b ){
        System.out.println("this is short");
        return a == b;
    }

    public static boolean sum(long a ,long b ){
        System.out.println("this is long");
        return a == b;
    }

    public static boolean sum(int a ,int b ){
        System.out.println(a);
        System.out.println("this is int");
        return a == b;
    }
}
