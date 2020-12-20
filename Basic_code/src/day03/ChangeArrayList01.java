package day03;

import java.util.ArrayList;
import java.util.Random;

public class ChangeArrayList01 {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 20; i++) {
            int num = rd.nextInt(100);
            list.add(num);
            System.out.println("我是第一个大的集合"+list.get(i));
        }
        doubleList(list);
    }
    public static ArrayList doubleList (ArrayList list){
        ArrayList list1 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int num = (int) list.get(i);
            if(num % 2 == 0) {
                list1.add(num);
                System.out.println(list1.get(i));
            }
        }
        return list1;
    }
}
