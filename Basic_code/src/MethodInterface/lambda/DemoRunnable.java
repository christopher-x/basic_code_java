package MethodInterface.lambda;

public class DemoRunnable {


    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }


    public static void main(String[] args) {
        //调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello"+Thread.currentThread().getName()+"线程开启");
            }
        });
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"线程开启");
        });
        startThread(()-> System.out.println("新线程开启"));
    }
}
