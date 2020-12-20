package day03;

import java.util.List;

public class tryCatchMethod {
    public static void main(String[] args) {
//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组越界异常");
//        }
//
//        try {
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));
//        }catch (IndexOutOfBoundsException i){
//            System.out.println("集合越界");
//        }


        //如果异常存在子父类关系，那么优先处理子类异常，否则会报错
        try {
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
            int[] arr = {1,2,3};
            System.out.println(arr[3]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }catch (IndexOutOfBoundsException i){
            System.out.println("集合越界");
        }
        System.out.println("程序执行成功！");
    }
}
