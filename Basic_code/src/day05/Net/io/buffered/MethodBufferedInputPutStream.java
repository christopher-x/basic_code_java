package day05.Net.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
    缓冲区：主要是提高读写的效率
    java.day05.Net.io.BufferedOutPutStream extends OutputStream：字节流输出流
 */
public class MethodBufferedInputPutStream {

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("/Users/christopher/Downloads/1112.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len = 1024 ;
//        while ((len = bis.read())!= -1){
//            System.out.println(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read())!= -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
