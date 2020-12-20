package day06.stream;

import java.util.stream.Stream;

public class Demo07Stream_Concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","里斯","王武","赵六");
        Stream<String> stream1 = Stream.of("张三", "里斯","王武","赵六","lalalal","dsad","dsds");
        //将两个流组合到一起，合成一个新的流
        Stream<String> concat = Stream.concat(stream1,stream);
        concat.forEach((e)-> System.out.println(e));
    }
}
