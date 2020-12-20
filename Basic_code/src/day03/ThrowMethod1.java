package day03;

/*
    throw关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对唱
    格式：
        throw aaaException ,bbbException
    注意：
        throw关键字必须写在方法声明处
        throws关键字后边声明的异常必须是exception或者是exception的子类
        方法内部如果抛出多个异常对象，那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有父子类罐子，那么直接声明父类异常即可
        调用了一个声明抛出异常的方法，我们就必须得处理声明的异常
            要么继续使用throws声明抛出，交给方法的调用者处理，最终交给jvm
            那么try...catch   自己处理异常
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowMethod1 {
    public static void main(String[] args) throws IOException{
        readFile("c:\\a.tx1t");
    }

    /*
    定义一个方法，对传递的文件路径进行合法性判断
     */
    public static void readFile(String fileName) throws IOException{
//        if(!fileName.equals("c:\\a.txt")){
//            throw new FileNotFoundException("重新写～ 憨批");
//        }

        if(!fileName.endsWith(".txt")){
            throw new IOException("**的。后缀名不对");
        }
        System.out.println("输入正确！牛皮！");
    }
}
