public class TestThreadRunnableMethod {
    public static void main(String[] args) {
        ThreadRunnable tr = new ThreadRunnable();
        Thread t = new Thread(tr);
        Thread t1 = new Thread(tr);
        Thread t2 = new Thread(tr);
        t.start();
        t1.start();
        t2.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"没来，你烟花了～");
            }
        };
        new Thread(r).start();

        new Thread(){@Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"没来，你烟花了111～");
            }
        }.start();
    }
}
