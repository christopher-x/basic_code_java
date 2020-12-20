package MethodInterface.lambda;

public class DemoLogger01  {
    public static void showLog(int level, MessagesBuilder mb ){
        //对日志的等级进行判断，如果是1级别，那么输出日志信息
        if(level == 1){

            System.out.println(mb.message());
        }


    }
    public static void main(String[] args) {
        //定义三个日志信息

        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(2,()->{
            System.out.println("不满足条件不执行");
            return msg1+msg2+msg3;
        });
    }
}
