package day05.Net.io.write;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchMethod {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/christopher/Downloads/1111.txt",true);
            for (int i = 0; i < 100000; i++) {
                fw.write("hello,world\r\t\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
