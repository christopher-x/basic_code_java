package day05.Net.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
    对象的反序列化流
    作用：把对象以流的方式写入到文件中保存
    使用步骤：创建ObjectInputStream对象，构造方法中传递字节输出流
            使用ObjectInputStream对象中的方法readObject，把对象写入到文件中
            释放资源
     static关键字：静态关键字
                静态优先于非静态加载到内存中（静态优先于对象进入到内存中
                被static修饰的成员变量不能被序列化，序列化的都是对象
     transient关键字：瞬态关键字
                被修饰的成员都无法进行被序列化

 */
public class MethodObjectInputStream {
    public static void main(String[] args) throws Exception {
        //创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/christopher/Downloads/113.txt"));
        Object o = ois.readObject();
        Person o1 = (Person) o;
//        System.out.println(o);
        System.out.println(o1.getName()+o1.getAge());
        ois.close();
    }
}
