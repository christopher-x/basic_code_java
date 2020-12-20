package day05.Net.io.read;

import java.io.FileReader;
import java.io.IOException;

/*
    java.day05.Net.io.Reader : 字符输入流，是字符输入流最顶层的父类，定义了一些共性的成员方法，是一个抽象类
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/christopher/Downloads/1111.txt");
        int len = 0;
        char[] chars = new char[1024];
        while((fr.read(chars))!= -1){
            System.out.println((char)len);
        }
        fr.close();
    }
}
