package day06.stream.method;

/*
数组的构造器引用
 */
public class Demo {
    /*
    定义一个方法
        方法的参数，传递创建数组的长度，和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
    public static int[] createArray(int length,ArrayBuilder ab ){
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        //根据数组的长度，创建数组并返回
        int[] arr = createArray(20,(len)->new int[len]);

        /*
        使用方法引用优化Lambda表达式
        已知创建的是int[]数组
        数组的长度也是已知的
        就可以使用方法引用
        int[] new ,根据参数传递的长度来创建数组
         */

        int[] arr1 = createArray(10,int[]::new);
        System.out.println(arr.length);
        System.out.println(arr1.length);
    }
}