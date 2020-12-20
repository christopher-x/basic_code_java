package day05.Net.Consumer.andThen;

import java.util.function.Consumer;

public class Demo01AndThen {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String message : arr){

            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[]  arr = {"张飞,男","估计娜扎,女","玛尔扎哈,女"};
        printInfo(arr,(message)->{
            String split = message.split(",")[0];
            System.out.print("姓名："+split+",");
        },(message)->{
            String sex = message.split(",")[1];
            System.out.println("性别是："+sex);
        });



    }
}
