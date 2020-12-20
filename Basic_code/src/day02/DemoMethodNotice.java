package day02;

/*
注意：
    方法定义在类中，但是不能在方法中再定义方法，不能嵌套
    方法的定义前后顺序无所谓
    方法定义后不会执行，需要调用才能执行，单独调用，打印调用，赋值调用
        void类型方法只能单独调用
    如果方法有返回值，那么必须写return返回值，否则会报错
    return后面的返回值数据，必须和方法的返回值类型对应
    一个方法可以有多个return语句，但是保证同时只有一个会被执行
 */
public class DemoMethodNotice {
    public static int method1(){
        return 10;
    }
    public static void method2(){
        return;
    }
}
