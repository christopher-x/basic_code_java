package day05.Net.io.outputstream;

import java.io.FileOutputStream;

/*
    java.day05.Net.io.OutputStream:字节输出流
        此抽象类是表示输出字节流的所有类的超类

    写入数据的原理：（内存----硬盘）
        java程序---JVM（虚拟机）---OS调用写入----将数据写入到文件中
    字节输出流的使用步骤（重点）
        创建对象FileOutputStream对象，构造方法中传递写入数据的目的地
        调用FIleOutputStream对象中的呃方法write，把数据写入到文件中
        释放资源
 */
public class OutputStream {
    public static void main(String[] args) throws Exception{
        //创建一个对象，构造方法中传递写入数据的目的地
        FileOutputStream f = new FileOutputStream("/Users/christopher/Downloads/python");
        //调用对象中的方法Write，把数据写入到文件中
        //数字小于128将会把数字转换为ASCII表中的字符！！！
        f.write(111);
        //释放资源
        f.close();
    }
}
