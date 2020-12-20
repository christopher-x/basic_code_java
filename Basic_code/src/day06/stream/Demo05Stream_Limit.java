package day06.stream;

import java.util.stream.Stream;

/*
Limit方法可以对流进行截取，只取前n个，方法签名：
    Stream<T> limit（long maxsize)
 */
public class Demo05Stream_Limit {
    public static void main(String[] args) {
        //String[] arr = {"张三", "里斯","王武","赵六","lalalal","dsad","dsds"};

        //将数组赋值给Stream流
        //Stream<String> stream = Stream.of(arr);
        //两种写法都可以
        Stream<String> stream = Stream.of("张三", "里斯","王武","赵六","lalalal","dsad","dsds");
        //使用limit方法获取当前数组的前几个
        Stream<String> limit = stream.limit(3);
        limit.forEach((s)->System.out.println(s));
    }
}
