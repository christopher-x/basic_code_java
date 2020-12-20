package day02;

import java.util.Arrays;

/*
遍历数组：
    对数组内的每个元素进行逐一输出
    快捷键：array.fori（
 */
public class DemoArrayPrint {
    public static void main(String[] args) {
        int [] array = {15,2,3,4,5,6,7,8,9,4,3,1,3,1,3,2,4,65,48,5,45,4,6,5,};
        int max = array[0];
        for (int i = 0; i < array.length ;i ++){
            //System.out.println(array[i]);
            if(array[i] > max){
                max = array[i];
                System.out.println("当前最大值为："+max);
            }
        }
    }
}
