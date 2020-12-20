package day03.thread;

public class MyThread {
    public static void main(String[] args) {
        MoreThread mt = new MoreThread();
        mt.start();
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main"+i);
//        }
        new MoreThread().start();
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(Thread.currentThread().getName());
    }
}
