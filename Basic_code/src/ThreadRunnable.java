public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"老弟，来了啊～");
    }
}
