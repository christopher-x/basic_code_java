package day04;

/*
String 当中与转换相关的常用方法有：
    public char[] toCharArray();将当前字符串拆分为字符数组作为返回值
    public bte getBytes();获得当前字符串底层的字节数组；
    public String replace(CharSequence oldString, CharSequence new String);
    将所有出现的老字符替换为新字符串，返回替换之后的新字符串
 */
public class DemoStringConvert {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        // 字符串内容替换
        String str1 = "hello";
        String str2 = str1.replace("o","OOO");
        System.out.println(str2);

    }
}
