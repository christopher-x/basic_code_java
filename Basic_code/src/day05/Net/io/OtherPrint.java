package day05.Net.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OtherPrint {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");

        //输出重定向
        PrintStream ps = new PrintStream("/Users/christopher/Downloads/aaa.txt");
        System.setOut(ps);
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
