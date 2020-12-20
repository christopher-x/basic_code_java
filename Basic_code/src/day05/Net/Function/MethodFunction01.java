package day05.Net.Function;

import java.util.function.Function;

/*
    java.util.function.function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者成为前置条件，后者成为后置条件
    funtion接口中最主要的抽象方法为：R，Apple<T t)根据类型t的参数获取类型R的结果
    使用场景例如：Integer转换为String，或者String转换为integer
 */
public class MethodFunction01 {
    /*
    定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个function接口，泛型使用<String,Integer>
        使用Function接口中断呃方法，apply，把字符串类型的整数，转换为Integer类型的整数

     */
    public static void method01(String s ,Function<String ,Integer> function){
        Integer number = function.apply(s);
        System.out.println(number);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "1112";
//        method01(s,(String s1 )->{
//            //将字符串转换为整数
//            return Integer.parseInt(s);
//        });

        //使用lamdba表达式，将字符串转换为整数.
        method01(s,(s1)->Integer.parseInt(s));
    }
}
