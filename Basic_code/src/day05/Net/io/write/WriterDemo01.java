package day05.Net.io.write;

import java.io.FileWriter;

public class WriterDemo01 {
    public static void main(String[] args) throws Exception{
        //追加写入：
        FileWriter fw = new FileWriter("/Users/christopher/Downloads/1111.txt",true);

        //FileWriter fw = new FileWriter("/Users/christopher/Downloads/1111.txt",true);
        //写入一个数组到文件中
        char[] c = {'a','b','1','d','e'};
        fw.write(c);

        //写入字符串
        fw.write("你好，我是你爹～");

        //写入一个换行
        fw.write("\r");
        //追加写入
        fw.append("sdsdsdsds");
        fw.write("你好，我是你爹～");
        fw.flush();

        fw.close();
    }
}
