package day05.Net.io;

import java.io.File;
import java.io.FileFilter;

public class DemoFile001 {
    public static void main(String[] args) {
        File file = new File("/Users/christopher/Documents/GitHub");
        show01(file);

    }

    //遍历当前路径下所有文件和文件夹
    private static void show01(File file) {
        File[] files = file.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File file1 : files) {
            if (file1.isDirectory()) {
                show01(file1);
            }else{
                System.out.println(file1);
            }
        }
    }
}
