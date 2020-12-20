package MethodInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class DemoMethod {
    //定义一个方法，参数使用函数式接口MyFunctionInterface
    public static void show(MyFunctionInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionInterfaceImpl());

        //调用show方法，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("hello");
            }
        });
        show(()->System.out.println("chongxie lambda" + "biaoshi"));
    }
}
