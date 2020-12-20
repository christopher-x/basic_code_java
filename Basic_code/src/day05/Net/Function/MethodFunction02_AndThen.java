package day05.Net.Function;

import java.util.function.Function;

/*
    Function接口中的默认方法andThen，用来进行组合操作

    需求：
        把string类型的123转换为Integer类型，把转换后的结果加10
        把增加之后的Integer类型的数据，转换为String类型

     分析：
        首先将字符串转换为整数类型，进行运算后再转换为字符串类型
 */
public class MethodFunction02_AndThen {
//    /*
//    定义一个方法，用来将字符串类型转换为整数类型
//     */
//    public static int method01(String s , Function<String ,Integer> fun){
//        Integer number = fun.apply(s);
//        number +=10;
//        System.out.println("做完计算的数字为："+number);
//        return number;
//    }
//    public static void method02(int a ,Function<Integer,String> fun1){
//        String apply = fun1.apply(a);
//        System.out.println(apply+"是我最终转换后的数字");
//    }

    public static void method01(String s ,Function<String,Integer> fun1,Function<Integer,String > fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }




    public static void main(String[] args) {
        String s1= "1023";
//        method01(s1,(String s2)->{
//            //字符串转换为整数+10
//            return Integer.parseInt(s2)+10;
//        },(Integer s3)->{
//            return s3+"";
//        });

        //优化lambda表达式～  牛逼
        method01(s1,s2->Integer.parseInt(s2)+10,s3->s3+"");
    }
}