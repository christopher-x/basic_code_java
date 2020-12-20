package MethodInterface.lambda;

/*
    日志
 */
public class DemoLogger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message){
        //对日志的等级进行判断，如果是1级别，那么输出日志信息
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息

        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        String msg4 = "hate";

        showLog(1,msg1+msg2+msg3+msg4);
    }
}
