package day05.Net.io.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutPutStreamMore {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("/Users/christopher/Downloads/lll");
        byte[] bt = {65,66,67,68,69,70};
        file.write(bt);
       // file.close();
        //传递进入一个byte数组，开始位置off：，len：个数
        file.write(bt,1,2);
        //file.close();
        byte bt2[] ="你好，我是你爹～".getBytes(StandardCharsets.UTF_8);
        file.write(bt2);
        file.close();

    }
}
