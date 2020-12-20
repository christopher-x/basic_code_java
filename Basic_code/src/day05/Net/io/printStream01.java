package day05.Net.io;

import java.io.PrintStream;

/*
    java.day05.Net.io.printStream:打印流
        printStream：为其他输出流添加了功能，使他们能够方便的打印各种数据值来表示形式
        printStream特点：
            只负责数据的输出，不负责数据的读取
            与其他输出流不同，printStream不会抛出IOException异常
            有特有的方法，print，println
                void print（任意类型的值
                void println（任意类型的值
        构造方法：
            printStream（File file）：输出目的地是一个文件
            printStream（outputStream out）输出目的地是一个字节输出流
            printStream（String filename）输出的目的地是一个文件路径
            PrintStream extends outputStream 父类有的方法它都有
        注意：
            如果使用继承父类的write方法写数据，那么查看数据时会查看编码表 97-> a
            如果使用自己本身的方法，那么写的数据是原样输出 97 -97
 */
public class printStream01 {
    public static void main(String[] args) throws Exception {
        //创建一个打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("/Users/christopher/Downloads/1111.txt");
        //如果使用继承父类的write方法写数据，那么查看数据时会查看编码表 97-> a
        ps.write(97);
        ps.println("sdd");
        ps.println(97);
        ps.close();
    }
}
