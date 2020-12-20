package day05.Net.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/*
    缓冲区：主要是提高读写的效率
    java.day05.Net.io.BufferedOutPutStream extends OutputStream：字节流输出流
 */
public class MethodBufferedOutPutStream {

    public static void main(String[] args) throws Exception{
        FileOutputStream fs = new FileOutputStream("/Users/christopher/Downloads/1111.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fs);
        bos.write("lllllll~~~~~~~".getBytes(StandardCharsets.UTF_8));
        //bos.flush();
        bos.close();
    }
}
