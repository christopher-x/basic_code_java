package day06.stream;

/*
java.util.stream.Stream; forEach    常用遍历方法
 */

import java.util.stream.Stream;

public class Demo02GetStream {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三","里斯","王武","赵六");
        //对Stream流中的元素进行过滤，只要姓张的人
        Stream<String> str = stream.filter((name)->name.startsWith("张"));
        //遍历Stream2流  --- 当前流对象只能调用一次。
        str.forEach((name)->System.out.println(name));
        /*
        Stream流属于管道流，只能被消费（使用）一次
        第一个Stream流调用完毕，数据就会流转到下一个Stream流上
        而此时第一个Stream流已经使用完毕，就会关闭了
        第一个Stream流就不能再进行调用方法了。
         */
    }
}
