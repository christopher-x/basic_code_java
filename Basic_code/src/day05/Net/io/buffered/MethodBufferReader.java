package day05.Net.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class MethodBufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/Users/christopher/Downloads/1112.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
