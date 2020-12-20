package day06.stream;

import java.util.*;
import java.util.stream.Stream;

/*

 */
public class Demo01Stream {
    public static void main(String[] args) {
        //将集合转换为Stream流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //Set集合转换为Stream流
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        //Map集合转换为Stream流
        Map<String,String> map = new HashMap<>();
        //获取键，存粗到一个set集合中
        Set<String> keyset = map.keySet();
        Stream<String> stream2 = keyset.stream();

        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        //获取键值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        entries.stream();

        //把数组转换为Stream流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream4 = Stream.of(arr);
    }
}
