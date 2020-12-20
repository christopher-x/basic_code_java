package day02;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都需要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有改功能的人，来帮我做事

面向对象三大特性
    封装
    继承
    多态

类的定义：
    public class hello{
        类体
    }
    属性：是什么
        姓名：        年龄：        性别*******
    行为：能做什么
        吃饭  睡觉  打豆豆 学习
    对应的Java类当中为：
        成员变量（属性）
        成员方法（行为）
注意：
    成员变量是直接定义在类当中的，在方法外
    成员方法不要写static关键字
 */
public class DemoPrintArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length -1 ){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+",");
            }
        }
        System.out.println(Arrays.toString(array));
    }
    String name ;
    int age ;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
