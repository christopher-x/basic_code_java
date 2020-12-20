package day05;

import java.util.HashMap;
import java.util.Scanner;

/*
使用Scanner获取用户输入的字符串
创建map集合，key是字符串中的字符，value是字符的个数
遍历字符串，获取每一个字符
使用获取到的字符，去map集合中判断key是否存在
    key存在：
        通过key，获取value个数
        value++
        put(key,value)把新的value存储到集合中
    key不存在：
        put（key，1）
    遍历map集合，输出结果
 */
public class HashMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c :str.toCharArray()){
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for (Character character : map.keySet()) {
            Integer value = map.get(character);
            System.out.println(character+"="+value);
        }
    }
}
