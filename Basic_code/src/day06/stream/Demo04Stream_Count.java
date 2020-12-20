package day06.stream;

import java.util.stream.Stream;

/*
Stream流中的常用方法_Count:用于统计Stream流中元素的个数
    long count（）；
    count方法是一个终结方法，返回值是一个long类型的整数
    所以不能再调用Stream流中的其他方法
 */
public class Demo04Stream_Count {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        long l = stringStream.count();
        System.out.println(l);
    }
}
