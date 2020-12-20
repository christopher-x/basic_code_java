package day03.thread;

/*
    主线程：执行main方法的线程
    单线程：Java程序中只有一个线程
    执行从main方法开始，从上到下依次执行
 */
public class MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();
        Person p2  = new Person("校长");
        p2.run();
    }
}
