package day05.Net.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
    对象的序列化流
    作用：把对象以流的方式写入到文件中保存
    使用步骤：创建ObjectOutputStream对象，构造方法中传递字节输出流
            使用ObjectOutputStream对象中的方法WriteObject，把对象写入到文件中
            释放资源

 */
public class MethodObjectOutputStream {
    public static void main(String[] args) throws Exception {
        //创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/christopher/Downloads/113.txt"));
        oos.writeObject(new Person("小美女", 18));
        oos.close();
    }
}
