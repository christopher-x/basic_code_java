package day05.Net.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test01 {
    /*
        练习：转换文件编码
            将GBK编码的文本文件，转换为utf-8编码的文本文件
        分析：
            创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
            创建OutPutStreamWrite对象，构造方法中传递字节输出流和指定的编码表名称utf-8
            使用InputStreamReader对象中的方法read读取文件
            使用outputStreamwrite对象中的方法write，把读取的文件写入到文件中
            释放资源
     */
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/christopher/Downloads/1112.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/christopher/Downloads/1113.txt"),"utf-8");
        int len = 0;
        while ((len = isr.read())!= -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
