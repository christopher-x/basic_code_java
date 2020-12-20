package day05.Net.Consumer.andThen.Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    /*
    java.util.function.Predicate<T>接口
    作用：对某种数据类型的数据进行判读啊，结果返回一个Boolean值

    Predicate接口中包含一个抽象方法：
        Boolean test<T> 用来对指定数据类型数据进行判断的方法
        结果：
            符合条件，返回true
            不符合条件，返回false
     */

    /*
    定义一个方法
    参数传递一个String类型的字符串
    传递一个Predicate接口，泛型使用String
    使用Predicate中的test对字符串进行判断，并把判断的结果返回
     */
    public static boolean method(String str, Predicate<String> str1){
        boolean str2 = str1.test(str);
        System.out.println("当前boolean值为"+str2);
        return str2;
    }

    public static void main(String[] args) {
        //常规写法
        method("321", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.equals("32")){
                    return true;
                }else{
                    return false;
                }
            }
        });

        method("asdhjjksdhajkdsajdhasjk",(String str)->{
            //对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断的结果返回
           if(str.length() < 5){
               return true;
           } else {
               return false;
           }
        });

        //Lambda牛逼
        method("asdhjjksdhajkdsajdhasjk",(str)->str.length() > 5);
    }
}