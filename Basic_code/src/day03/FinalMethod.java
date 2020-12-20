package day03;

import java.io.IOException;

public class FinalMethod {
    public static void main(String[] args) {
        TryMethod tm = new TryMethod();
        try {
            tm.readFile("d://1txt");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
        System.out.println("资源释放");
        }
    }
}
