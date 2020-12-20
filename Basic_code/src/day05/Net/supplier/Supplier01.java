package day05.Net.supplier;
import java.util.function.Supplier;


/*
    常用的函数式接口
    day05.Net.supplier<T> 接口被称之为生产接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 */
public class Supplier01 {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->"张飞");
        System.out.println(s);
    }
}
