package day05.Net.io.outputstream;

import java.io.FileInputStream;

public class ReadPutStream {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("/Users/christopher/Downloads/顺丰.sql");
        byte[] i = new byte[4096];
        int len = file.read(i);
        System.out.println(len);
        //file.close();
        len = file.read();
        while (true){
            if (len <= 0){
                break;
            }else {
                System.out.println(len);
            }

        }
        file.close();
    }
}
