package day06.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DemoStreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("张三三");
        one.add("里斯四");
        one.add("王武流");
        one.add("赵六把");
        one.add("赵四啊");
        one.add("王三呃");
        one.add("里尔奥迪");
        one.add("理多少啊");
        one.add("王三收到");
        one.add("赵6但是");
        //遍历拿到姓名有三个字的,并存储到一个新的集合中

        //System.out.println(ones);
        //拿到只有三个字的用户名后只取前三个名字
        Stream<String> ones = one.stream().filter((name)->name.length()==3).limit(3);

        ArrayList<String> two = new ArrayList<>();
        two.add("无党派");
        two.add("张三疯");
        two.add("宋远桥");
        two.add("张翠三");
        two.add("路代码");
        two.add("看不见");
        two.add("张二狗");
        two.add("尼古拉斯赵四");
        two.add("东北f4");
        two.add("张无忌");
        two.add("殷素素");

        Stream<String> twos = two.stream().filter((s)->s.startsWith("张")).skip(2);
        Stream.concat(ones,twos).map(name -> new Person(name)).forEach((s)-> System.out.println(s));
        //Stream<String> concat = Stream.concat(ones,twos);
       // concat.forEach((e)-> System.out.println(e));
    }
}
