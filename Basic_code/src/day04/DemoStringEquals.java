package day04;
/*
双等号(==)是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法；
    public boolean equals(object obj) 参数可以是任何对象，只是参数是一个字符串，并且内容相同才会返回true，否则返回false
    注：任何对象都可以用object来进行接收
    equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
    如果一个变量一个常量，推荐把常量字符串写在前面
 */
public class DemoStringEquals {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("abc"));

        //推荐写法，常量字符串卸载前
        String str4 = "abc";
        System.out.println("abc".equals(str2));

        //使用equalsIgnoreCase来忽略大小写进行比较
        String str5 = "ABC";
        System.out.println("忽略大小写"+str5.equalsIgnoreCase(str1));
    }
}
