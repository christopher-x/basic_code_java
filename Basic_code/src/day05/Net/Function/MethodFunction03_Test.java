package day05.Net.Function;

import java.util.function.Function;

public class MethodFunction03_Test {


    public static int method(String s, Function<String, String> fun, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        /*
        定义一个方法
        参数传递包含姓名和年龄的字符串，参数再传递三个Function接口用于类型转换
         */
        return fun.andThen(fun2).andThen(fun3).apply(s);

    }

    public static void main(String[] args) {
        String str = "张三,123";

        //调用方法，并接收返回值
        int number = method(str,(String str1)->{
            //取出当前字符串中的数字位，并返回
            return str1.split(",")[1];
        },(String str2)->{
            //将取到的字符串转换为int类型的数字
            return Integer.parseInt(str2);
        },(Integer i)->{
            //将数字做运算之后进行返回
            return i+100;
        });
        System.out.println(number);
    }
}
