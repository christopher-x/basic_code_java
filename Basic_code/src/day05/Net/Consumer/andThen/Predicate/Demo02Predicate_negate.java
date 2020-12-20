package day05.Net.Consumer.andThen.Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_negate {
    public static boolean checkString(String s, Predicate<String> pre1) {
//         return !pre1.test(s);
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "dsadasdasdas";
        boolean b = checkString(s, (str)->str.length() > 5);
            //判断长度是否大于5
        System.out.println(b);
    }
}
