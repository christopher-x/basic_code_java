package day05.Net.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
    java.day05.Net.io.BufferedWriter extends Write
    BufferedWrite:字符缓冲输出流

    继承自父类的共性成员方法
 */
public class MethodBufferedWrite {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/christopher/Downloads/1112.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("你好，我是你爹～");
            bw.newLine();
        }
        bw.flush();
    }
}
