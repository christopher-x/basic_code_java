package day05.Net.io;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        //判断是否为目录，如果是，则返回true
        File f = new File("/Users/christopher/Library/");
        System.out.println("是个目录？："+f.isDirectory());

        //判断是否为文件，如果是，则返回true
        System.out.println("是个文件？："+f.isFile());

        //判断当前文件是否存在，如果存在再进行判断，如果文件不存在则返回fales
        if(f.exists()){
            System.out.println("是个目录？："+f.isDirectory());

            //判断是否为文件，如果是，则返回true
            System.out.println("是个文件？："+f.isFile());
        }

    }

    private static void show01() {
        //判断当前路径是否存在，如果存在则返回true
        File f = new File("/Users/christopher/Library/");
        boolean exists = f.exists();
        System.out.println(exists);

        File f1 = new File("/Users/christopher/Li/");
        boolean exists1 = f1.exists();
        System.out.println("？？？？"+exists1);
    }
}
