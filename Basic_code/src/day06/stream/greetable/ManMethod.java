package day06.stream.greetable;

/*
    定义子类
 */
public class ManMethod extends MethodHuman {
    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("hello . im a ~Man");
    }

    public void method(MethodGreet g) {
        g.greet();
    }

    public void show() {
        method(() -> {
            //创建父类
            //super.sayHello();
//            MethodHuman mh = new ManMethod();
//            mh.sayHello();
        });
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new ManMethod().show();
    }
}
