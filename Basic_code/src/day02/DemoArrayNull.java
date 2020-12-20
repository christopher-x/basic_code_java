package day02;

/*
所有引用类型变量，都可以赋值为null值

数组必须进行new初始化后才能使用其中的元素，如果只是赋值了一个null，没有进行new创建
那么将会发生，空指针异常 NullPointerException
 */
public class DemoArrayNull {
    public static void main(String[] args) {
        int array[] = null ;
        System.out.println(array[0]);
    }

}
