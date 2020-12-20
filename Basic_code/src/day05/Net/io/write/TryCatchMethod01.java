package day05.Net.io.write;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchMethod01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("/Users/christopher/Downloads/1111.txt");
            FileOutputStream fos = new FileOutputStream("/Users/christopher/Downloads/1112.txt");){
            int len = 0;
           while((len = fis.read())!= -1){
               fos.write(len);
           }
        }catch (IOException e){
                e.printStackTrace();
        }
    }
}
