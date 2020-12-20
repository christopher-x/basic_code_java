package day05.Net.io;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) {
        //show01();
        //show02();//创建单级文件夹。
        //show03();//创建多级文件夹
        show04();//删除文件夹，或者文件

    }

    private static void show04() {
        //删除文件，或者文件夹，一次只能删一个～
        File file = new File("/Volumes/资料/aaa1/aa/1a1");
        boolean delete = file.delete();
        System.out.println(delete);
    }

    private static void show03() {
        //创建多级文件夹
        File file = new File("/Volumes/资料/aaa1/aa/1a1/aaa/");
        boolean mkdirs = file.mkdirs();
        System.out.println("来一发？" + mkdirs);
        File file1 = new File("/Volumes/资料/aaa1/aa/1a1/aaa/aa.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件创建？？？" + file1);
    }

    private static void show02() {
        //创建单级文件夹
        File file = new File("/Volumes/资料/aaa");
        boolean mkdir = file.mkdir();
        System.out.println("创建文件夹" + mkdir);
    }

    private static void show01() {
        //创建文件
        //当路径不存在时，则会抛出IOException
        //此方法只能创建文件，不能创建文件夹
        //当文件成功创建时，返回true，如果文件已存在，则返回false
        File file = new File("/Volumes/资料/aaa.txt");
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建文件成功：" + newFile);
    }
}
