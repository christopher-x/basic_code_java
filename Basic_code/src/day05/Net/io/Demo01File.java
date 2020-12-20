package day05.Net.io;

import java.io.File;

/*
java.day05.Net.io.File 类
    文件和目录路径名的抽象表示形式
    Java把电脑中的文件和文件夹，封装为一个file类，我们可以使用file类对文件和文件夹进行操作
    我们可以使用file类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹
        对文件夹进行遍历
        获取文件的大小
    file类是一个与系统无关的类，任何系统中系统都可以使用这个类中的方法

 */
public class Demo01File {
    public static void main(String[] args) {
        //路径分隔符：Windows和linux下运行此方法得到的结果不同
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        //文件名称分隔符：Windows和linux下运行此方法得到的结果不同
        String separator = File.separator;
        System.out.println(separator);

    }
}
