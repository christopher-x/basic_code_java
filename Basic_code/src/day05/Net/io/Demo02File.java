package day05.Net.io;

import java.io.File;

/*
    路径：
        绝对路径：是一个完整的路径
            以盘符开始的路径：c:\\a.txt
        相对路径：
            以当前目录为目录标的
            如果使用当前项目的跟目录，可以简化书写:c:\\123.txt简化为：(可以省略当前路径的根目录 123.txt
        注意：
            路径是不区分大小写
            路径中的文件名分隔符使用windows反斜杠，反斜杠是转义字符，两个反斜杠代表一个路径中的反斜杠
 */
public class Demo02File  {
    public static void main(String[] args) {
       // show01();
        //show02("/Users/christopher/","bin/java");
        show03();
    }

    //组合路径
    private static void show03() {
        File parent = new File("her/Library/Java/JavaVirtualMachine");
        File file = new File(parent,"h/Users/christopher/Library/Ja");
        System.out.println(file);
    }

    //双参数路径
    private static void show02(String parent,String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    //获取路径
    private static void show01() {
        File f1 = new File("/Users/christopher/Library/Java/JavaVirtualMachines/openjdk-15.0.1/Contents/Home/bin/java");
        System.out.println(f1);

        File f2 = new File("/Users/christopher/Library/Java/");
        System.out.println(f2);

        File f3 = new File("abc.txt");
        System.out.println(f3);
    }
}
