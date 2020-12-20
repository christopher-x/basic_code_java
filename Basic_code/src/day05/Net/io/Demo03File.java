package day05.Net.io;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        //show01();
        show02();

    }

    private static void show02() {
        //返回文件的大小   注意：无法返回文件夹大小。
        File f = new File("/Volumes/资料/www.shareanyway.tk.tar.gz");
        long length = f.length();
        double kb = length /1024/1024;
        System.out.println(kb);


    }

    private static void show01() {
        //获取构造方法中传递的路径
        File f = new File("/Volumes/资料/www.shareanyway.tk.tar.gz");
        File absoluteFile = f.getAbsoluteFile();
        System.out.println(absoluteFile);
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);

        //获取当前工作目录的路径
        File f1 = new File("abx.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println(f1);
        String name = f1.getName();
        System.out.println(name);
    }
}
