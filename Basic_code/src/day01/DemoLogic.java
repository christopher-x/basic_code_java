package day01;

/*
    与（并且） && 都是true，则为true
    或（或者） || 有一个为ture则为true
    非（取反） ！ 如果原本为true，变为false

    短路：&&当第一个为false时，直接返回false
    ||：有一个为true时，直接返回true

 */

public class DemoLogic {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);
    }
}
