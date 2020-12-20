package day02;

/*
面向对象三大特征：封装，继承，多态

封装在Java中的体现：
    方法就是一种封装
    关键字private也是一种封装
 */
public class DemoMethod1 {
    public static void main(String[] args) {
        int [] array = {1,5,5,6,4,2,};
        int max = getMax(array);
        System.out.println(max);
    }
    public static int getMax(int [] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
