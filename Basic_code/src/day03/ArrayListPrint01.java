package day03;

import java.util.ArrayList;

public class ArrayListPrint01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("法外狂徒");
        list.add("麻子");
        list.add("哟吼");
        list.add("可以的");
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            if (i == list.size() -1){
                System.out.println(name +"}");
            }else{
                System.out.print(name +"@");
            }
        }
    }
}
