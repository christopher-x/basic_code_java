package day03.thread;

/*
    创建多线程类的第一种方式：创建Thread类的子类
    java.lang.Thread类：是描述线程的类，想要实现多线程类，就必须继承Thread类

    实现步骤：
        创建一个Thread类的子类
        在Thread类的子类种重写Thread类中的run方法，设置线程任务（
        创建Thread类的子类对象
        调用Thread类中的Start方法，开启新的线程，执行run方法
            void start() 使该线程开始执行，Java虚拟机调用该线程的run方法
            结果是两个线程并发的运行，当前线程（main线程）和另一个线程（创建新线程，执行其run方法）
            多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动
        Java程序属于抢占式调度，那个线程优先级高，就优先执行该线程,同一个优先级，随机选择一个执行
 */
public class MoreThread extends Thread {
    @Override
    public void run() {
//        for (int i = 0; i <20 ; i++) {
//            System.out.println("Run"+i);
//        }
        String name = getName();
        System.out.println(name);
        currentThread().getName();
    }
}
