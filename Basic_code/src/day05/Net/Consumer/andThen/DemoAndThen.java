package day05.Net.Consumer.andThen;

import java.util.Locale;
import java.util.function.Consumer;

public class DemoAndThen {
    //Consumer接口的默认方法andThen
    /*
    作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，再对数据进行消费
     */

    public  static void method(String str, Consumer<String> con1 ,Consumer<String> con2){
//        con1.accept(str);
//        con2.accept(str);
        con2.andThen(con1).accept(str);
    }


    public static void main(String[] args) {
        method("hello",(t)->{
            System.out.println(t.toUpperCase(Locale.ROOT));
            System.out.println("将字符串转换为大写输出");
        },(t)->{
            System.out.println("将字符串转换为小写输出");
            System.out.println(t.toLowerCase(Locale.ROOT));
        });
    }
}
