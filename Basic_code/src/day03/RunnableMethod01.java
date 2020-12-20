package day03;



public class RunnableMethod01 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread();
        t.start();
    }

    private static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("调用来了？");
        }
    }
}
