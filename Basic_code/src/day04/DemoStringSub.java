package day04;

/*
字符串的截取方法：
    public String subString(int index)：截取从参数位置一直到字符串末尾，返回新字符串
    public String subString(int begin,int end)：截取从begin开始，一直到end结束，中间的字符串
    注意：[begin,end]包含左边，不包含右边
 */
public class DemoStringSub {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(6,10);
        System.out.println(str2);
    }
}
