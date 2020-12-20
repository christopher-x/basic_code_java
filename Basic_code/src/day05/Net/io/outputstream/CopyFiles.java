package day05.Net.io.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        long t = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/Users/christopher/Downloads/下载.jpeg");
        FileOutputStream fos = new FileOutputStream("/Volumes/资料/images.jpeg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read())!=-1){
            fos.write(bytes,0,len);
        }
        //先关闭写入，再关闭读取
        fos.close();
        fis.close();
        long t1 = System.currentTimeMillis();
        System.out.println("当前一共消耗了："+(t1-t)+"毫秒");
    }

}
