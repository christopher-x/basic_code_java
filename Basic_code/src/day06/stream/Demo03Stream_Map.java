package day06.stream;

import java.util.stream.Stream;

public class Demo03Stream_Map {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        //使用map方法，把字符串类型的整数，转换为Integer类型的整数
        Stream<Integer> integerStream = stringStream.map((s)->Integer.parseInt(s));
        integerStream.forEach((i)-> System.out.println(i));
    }
}
