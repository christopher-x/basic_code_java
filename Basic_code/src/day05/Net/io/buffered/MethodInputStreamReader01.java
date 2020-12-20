package day05.Net.io.buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
    java.day05.Net.io.InputStreamReader extends Reader
    InputStreamReader:是字节流通向字符流的桥梁，它使用指定的charset读取字节并将其解码为字符（解码

    构造方法：
        InputStreamReader(InputStream in)创建一个使用默认字符集的InputStreamReader
    使用步骤：
        创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        使用InputStreamreader对象中的方法read文件
        释放资源
    注意：
        构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码
 */
public class MethodInputStreamReader01 {
    public static void main(String[] args) throws Exception {
        read_utf_8();

    }

    private static void read_utf_8() throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/christopher/Downloads/1112.txt"),"gbk");
        int len = 0;
        while((len = isr.read())!= -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
