package day03.thread;

/*
    使用setName来设置线程名称
 */
public class SetThreadName {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("我是线程1");
        MoreThread mt = new MoreThread();
        mt.setName("1号");
        //mt.run();
        mt.start();
        System.out.println(t);
    }
}
