package day05.Net.io.write;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k ,v> implements Map<k ,v>
    Properties类表示了一个持久的属性集
 */
public class PropertiesMethod {
    public static void main(String[] args) throws Exception {
        //show01();
//        show02();
        show03();
    }

    //当使用load方法时，我们都采用字符流，使用字节流会乱码
    private static void show03() throws Exception{
        //创建一个Properties集合
        Properties p = new Properties();
        //使用Properties集合对象中的方法load读取保存键值对的文件
        p.load(new FileReader("/Users/christopher/Downloads/1111.txt"));
        //遍历Properties集合
        Set<String> strings = p.stringPropertyNames();
        for (String string : strings) {
            String value = p.getProperty(string);
            System.out.println(string+"="+value);
        }
    }

    /*
        OutputStream out :字节输出流，不能写中文
        Write write：字符输出流，可以写中文
        String Comments：注释，用来解释说明保存的文件是做什么用的
                不能使用中文，会产生乱码，默认是Unicode编码。一般使用"" 空字符串
        使用步骤：
            1.创建Properties集合对象，添加数据
            2.创建字节输出流/字符输入流对象，构造方法中绑定要输出到目的地
            3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
            4.释放资源
     */
    private static void show02() throws Exception {
        Properties p = new Properties();
        p.setProperty("张三", "22");
        p.setProperty("张飞", "21");
        p.setProperty("诸葛亮", "22");
        //创建对象
        FileWriter fw = new FileWriter("/Users/christopher/Downloads/1111.txt");
        //持久化数据
        p.store(fw, "save date");
        //释放资源
        fw.close();

        //OutputStream out :字节输出流，不能写中文
//        p.store(new FileOutputStream("/Users/christopher/Downloads/1111.txt"),"");

    }

    private static void show01() {
        Properties p = new Properties();
        p.setProperty("张三", "22");
        p.setProperty("张飞", "21");
        p.setProperty("诸葛亮", "22");
        Set<String> strings = p.stringPropertyNames();
        System.out.println(strings);
        for (String string : strings) {
            String property = p.getProperty(string);
        }
    }
}
