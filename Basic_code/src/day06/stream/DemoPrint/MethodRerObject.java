package day06.stream.DemoPrint;

import java.util.Locale;

public class MethodRerObject {
    //定义一个成员方法,传递一个字符串，把字符串转大写进行输出
    public void printUpperCaseString(String str){
        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
