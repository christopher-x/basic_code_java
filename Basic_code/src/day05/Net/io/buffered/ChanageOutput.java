package day05.Net.io.buffered;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class ChanageOutput {
    /*
    构造方法：Outputstream（OutputStream out），创建使用默认字符编码的Outputstream
        转换流：
            创建Outputstream对象，构造方法中超换地输出流和指定的编码表名称
            使用Outputstream对象中的方法write，把字符转换为字节存储缓冲区中（编码）
            使用Outputstream对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
            资源释放
     */
    public static void main(String[] args) throws Exception {
        //write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws Exception{
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("/Users/christopher/Downloads/1113.txt"),"gbk");
        os.write("你好啊～");
        os.flush();
        os.close();
    }

    private static void write_utf_8() throws Exception{
        //如果没有指定默认的编码格式：默认为utf-8
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("/Users/christopher/Downloads/1112.txt"),"utf-8");
        os.write("你好啊～");
        os.flush();
        os.close();
    }
}
