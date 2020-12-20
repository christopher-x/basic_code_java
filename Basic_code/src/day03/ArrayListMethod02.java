package day03;

import java.util.ArrayList;
import java.util.Random;

/*
遍历集合
 */
public class ArrayListMethod02 {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList al = new ArrayList();
        al.add("张飞");
        al.add("王婆");
        al.add("王八");
        for (int i = 0; i <= 6 ; i++) {
            int a = rd.nextInt(33) +1;
            al.add(a);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println(al);
    }
}
