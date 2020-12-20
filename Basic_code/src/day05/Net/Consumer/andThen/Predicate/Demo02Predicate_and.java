package day05.Net.Consumer.andThen.Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_and {
    public static boolean checkString(String s , Predicate<String> pre1,Predicate<String> pre2){
       // return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "dsdasdasdas";
        boolean b = checkString(s,(String str)->{
            //判断长度是否大于5
           return str.length() > 5;
        },(String str1)->{
            //判断字符串是否包含a
            return str1.contains("a");
        });
        System.out.println(b);
    }
}
