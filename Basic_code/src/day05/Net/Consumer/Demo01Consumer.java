package day05.Net.Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name , Consumer<String> con){
        con.accept(name);
        System.out.println("进入方法中");
    }

    public static void main(String[] args) {
        method("张飞",(String name )->{
            System.out.println(name);
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
