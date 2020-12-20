package day04;

/*
String 当中与获取相关的常用方法有；
public int length():获取字符串当中含有字符个数，拿到字符长度
public String concat(String str) 将当前字符串和参数字符串拼接成为返回值新的字符串
public char charAt(int index) 获取指定索引位置的单个字符，（索引从0开始）
public int indexOf (String str) 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */
public class DemoStringGet {
    public static void main(String[] args) {
        int length = "dasjkdahdjhasjkdhasjkdhasjkdhsajdkhasjkdhasjkdhasjkdaj".length();
        System.out.println("字符串长度"+length);
        String str = "hello";
        String str1 = "world";
        //拼接字符串
        String str3 = str.concat(str1);
        System.out.println(str3);

        //获取指定位置的字符
        char str4 = "dsahjkdhasj".charAt(10);
        System.out.println(str4);

        //获取字符串中某个字符第一次出现的索引位置
        int original = "sdasjdksaljdkaljd1kjklasdjksaldsakd".indexOf("j");
        System.out.println(original);
    }
}
