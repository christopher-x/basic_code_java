package day05.Net.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
    练习：序列化集合
        当我们向在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中
        对集合序列化和反序列化
    分析：
        定义一个存储Person对象的ArrayList集合
        往ArrayList集合中存储Person对象
        创建一个序列化流ObjectOutputStream对象
        使用ObjectOutputStream中的方法writeObject对象，对集合进行序列化
        创建一个反序列化ObjectInputStream对象
        使用ObjectInputStream对象中的方法，readObject对象，将对象进行反序列化
        将Object类型的集合转换为ArrayList类型
        遍历当前集合（ArrayList
        释放资源
 */
public class Test02 {
    public static void main(String[] args) throws Exception{
        //定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();
        // 往ArrayList集合中存储Person对象
        list.add(new Person("张三",11));
        list.add(new Person("里斯",22));
        list.add(new Person("王武",33));
        list.add(new Person("找流",21));
        list.add(new Person("王八",31));
        list.add(new Person("哦哦",22));
        //创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/christopher/Downloads/113.txt"));
        //创建一个反序列化ObjectInputStream对象
        oos.writeObject(list);
        //使用ObjectInputStream对象中的方法，readObject对象，将对象进行反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/christopher/Downloads/113.txt"));
        //使用ObjectInputStream对象中的方法，readObject对象，将对象进行反序列化
        Object o = ois.readObject();
        //将Object类型的集合转换为ArrayList类型
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        //遍历当前集合（ArrayList
        for (Person p : list2) {
            System.out.println(p);
        }
        //释放资源
        ois.close();
        oos.close();

    }
}
