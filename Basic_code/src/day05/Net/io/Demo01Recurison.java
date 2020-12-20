package day05.Net.io;

/*
    递归的使用前提：
        当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 */

public class Demo01Recurison {
    public static void main(String[] args) {
        System.out.println("？？？");
//        a();
//        b(1);

    }

    public Demo01Recurison(){
        //构造方法禁止递归
        //Demo01Recurison();
    }
    private static void b(int i) {
        System.out.println(i);
        if (i == 200020){
            System.out.println(i);
            return;
        }
        b(++i);
    }

    private static void a() {
        //堆内存溢出
        System.out.println("!!!");
        a();
    }
}
