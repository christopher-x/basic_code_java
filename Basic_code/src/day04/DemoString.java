package day04;

/*
java.lang.String 类代表字符串
api：：Java程序中所有字符串面值（如abc）都作为此类的实例实现

特点：
    字符串的内容永不改变，正是因为字符串不可改变，所以字符串是可以共享使用的
    字符串效果相当于char字符数组，但是底层原理是byte[]字节数组

创建字符串的常见3+1种方式
三种构造方法：
    public String() 创建一个空白字符串，不含有任何内容
    public String(char[] array)：根据字符数组的内容，来创建对应的字符串
    public String(byte[] array)：*
 */
public class DemoString {
    public static void main(String[] args) {
        String str1 = new String();
        char[] charArray = {'a','b','c'};
        String str = new String(charArray);
        System.out.println(str);
    }
}
