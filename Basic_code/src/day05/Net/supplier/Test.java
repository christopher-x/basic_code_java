package day05.Net.supplier;

import java.util.function.Supplier;

public class Test {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Integer

    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组
        int a[] ={1211,12,1,2,3,47,5,6,7,8,6,4,6,45,78,54,45,64,2,544,0,15,4,1,121,};
        //调用getmax方法，方法的参数Supplier是一个函数式接口，所以可以传递lambda表达式
        int result = getMax(()->{
            int max = a[0];
            //遍历数组，获取数组中的其他元素
            for (int i : a){
                //如果i大于max，则替换max作为最大值
                if(i > max){
                    max = i;
                }
            }
            //返回最大值
            return max;
        });
        System.out.println("最大数值为"+result);
    }
}
