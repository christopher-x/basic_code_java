package day04;

/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成若干部分

注意：
    split在处理（.）的时候一定要使用转义符
 */
public class DemoStringSplit {
    public static void main(String[] args) {
        String str = "aaa bbb ccc ddd";
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
