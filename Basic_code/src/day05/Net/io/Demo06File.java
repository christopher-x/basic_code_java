package day05.Net.io;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
//        show01();
        show02();

    }

    private static void show02() {
        //遍历当前目录下的文件，此方法会打印出当前文件的路径
        File file = new File("/Users/christopher/Downloads");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    private static void show01() {
        //遍历当前目录下的文件
        /*
            如果遍历的目录不存在，则会抛出空指针异常
         */
        File file = new File("/Users/christopher/Downloads");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
