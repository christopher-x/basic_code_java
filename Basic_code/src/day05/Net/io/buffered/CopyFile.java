package day05.Net.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    文件复习练习：一读一写

    明确：
        数据源：/Users/christopher/Downloads/1112.txt
        数据目的地：/Users/christopher/Downloads/1112.txt
    文件赋值的步骤：
        创建字节缓冲输入流对象，构造方法中传递字节输入流
        创建字节缓冲输出流对象，构造方法中传递字节输出流
        使用字节缓冲输入流对象中的方法read，读取文件
        使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区中
        释放资源（会先把缓冲区中的数据，刷新到文件中
 */
public class CopyFile {
    public static void main(String[] args) throws  Exception{
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/christopher/Downloads/1112.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/christopher/Downloads/1113.txt"));

//        int len = 0;
//        while((len = bis.read())!= -1){
//            bos.write(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!= -1){

            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
        long s1 = System.currentTimeMillis();
        System.out.println(s1-s+"毫秒");
    }
}
