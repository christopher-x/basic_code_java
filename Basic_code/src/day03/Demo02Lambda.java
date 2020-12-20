package day03;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"~~~");
            }
        }){
        }.start();

        //lambda 表达式 牛皮～
        new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        }).start();

        /*
        lambda 表达式：标准格式：
            一些参数～
            一个箭头～
            一段代码～
        格式：
            参数列表 ->{重写方法的代码}
        解释说明：
            ()：接口中抽象方法的参数列表，没有参数就空着；有参数就写参数，多个参数用逗号分割
            -> 传递的意思，把参数传递给方法体
            {};重写接口的抽象方法的方法体
         */
    }
}
