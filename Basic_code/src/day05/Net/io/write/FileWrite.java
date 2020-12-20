package day05.Net.io.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/christopher/Downloads/1111.txt");
        fw.write(97);
        //fw.flush();
        fw.close();
    }
}
