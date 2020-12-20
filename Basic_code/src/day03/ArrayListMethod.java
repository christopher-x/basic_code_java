package day03;
import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是arraylist集合的长度是可以随意变化的
对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：装在集合当中的所有元素，必须是统一类型
注意：泛型只能是引用类型，不能是基本类型
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的都是String字符串类型的数据
        ArrayList al = new ArrayList();
        String name = "张三";
        int age = 19;
        al.add("name");
        al.add(age);
//        ArrayList<String> ar = new ArrayList<String>();
//        ar.add(name);
//        ar.add(String.valueOf(age));
//        System.out.println(ar);
        System.out.println(al);
    }
}
