package day04;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
public static String toString(数组)：将参数数组变成字符串(按照默认格式：[元素1.元素2.。。。。]
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        //将int[] 数组转换为字符串
        String str1 = Arrays.toString(arr);
        System.out.println(str1);
        //默认升序排序
        int arr1[] = {1,2,3,23,5,45,32,434,234,32,4,6,43,32};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
