package day02;

/*
数组的概念：可以保存多个数据（相同类型）
数组的特点：
    数组是一种引用数据类型
    数组当中的多个数据，类型必须统一
    数组的长度在程序运行期间不可改变

数组的初始化：
    在内存中创建一个数组，并且向其中赋予一些默认值
    两种常见的初始化方式：
        动态初始化（指定长度
            数据类型[] 数组名称 = new 数据类型[数组长度]；
        静态初始化（指定内容
            数据类型[] 数组名称 = new 数据类型[]{元素1，元素2.....}
            在创建数组时，不指定数据个数多少，而是直接将具体的数据内容进行指定

使用建议：
    确定数组内有多少元素使用静态初始化，否则使用动态初始化
 */
public class DemoArray {
    public static void main(String[] args) {
        //动态初始化:标准化写法

        int[] age = new int [999999];
        //动态标准化，拆分2步骤
        int[] age1;
        age1 = new int[10];

        //静态初始化：标准化写法
        String[] number = new String[]{"zhangsan","lisi","wangsu","zhaoliu"};
        String number1 = number[1];
        System.out.println(number1);
        //静态初始化简写方式

        int[] array1 = {1, 5, 9, 8, 3, 1, 2, 5, 4};
        System.out.println(array1[1]);
    }
}
