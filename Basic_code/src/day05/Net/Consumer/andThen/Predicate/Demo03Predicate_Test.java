package day05.Net.Consumer.andThen.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03Predicate_Test {
    /*
    练习：
        集合信息筛选
        数组当中有多条"姓名+性别"的信息如下
        String[] array= {"name,sex","name,sex".....}
        请通过Predicate接口的拼装将复合要求的字符串筛选到集合Arraylist中
        需要同时满足两个条件：
            1.性别必须为女；
            2.姓名必须为4个字

        分析：
            有两个判断条件，所以需要使用Predicate接口，对条件进行判断
            必须同时满足两个条件，所以可以使用and方法连接两个判断条件
     */
     /*
        定义一个方法：
            方法的参数传递一个包含人员信息的数组
            传递两个Predicate接口，用于对数组中的信息进行过滤
            把满足条件的信息存到ArrayList集合中并返回
     */

    public static void main(String[] args) {
        String[] array = {"张三李四,男","王武找流,男","1123,男","1231,女","1278,女","琉璃流啊,男"};
        ArrayList<String> list = filter(array,(String s)->{
            //获取字符串中性别
            return s.split(",")[1].equals("女");
        },(String s1)->{
           return s1.split(",")[0].length() >= 4;
        });
        System.out.println(list);
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            //判断条件是否成立，如果成立则将信息存储到ArrayList中
            boolean test = pre1.and(pre2).test(s);
            if(test){
                //条件成立，两个条件都满足，把信息存储到ArrayList集合中
                list.add(s);
            }
        }
        return list;
    }
}