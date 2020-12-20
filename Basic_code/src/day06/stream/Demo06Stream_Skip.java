package day06.stream;

import java.util.stream.Stream;

public class Demo06Stream_Skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "里斯","王武","赵六","lalalal","dsad","dsds");
        //跳过前三个元素，只取后面的元素
        Stream<String> sk = stream.skip(3);
        sk.forEach((s)-> System.out.println(s));
    }
}
