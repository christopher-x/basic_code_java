package day05.Net.io;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept (File pathname){
        //进入文件夹判断是否有存在的文件
        if (pathname.isDirectory()){
            return true;
        }
        //判断是否有.java文件
        boolean b = pathname.getName().toLowerCase().endsWith(".java");
        return b;
    }
}
