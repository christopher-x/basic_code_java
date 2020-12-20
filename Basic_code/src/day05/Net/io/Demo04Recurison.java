package day05.Net.io;

import java.io.File;

public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("/Users/christopher/Library/Java/JavaVirtualMachines/" +
                "openjdk-15.0.1/Contents/Home");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
