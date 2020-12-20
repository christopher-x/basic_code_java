package day02;
/*
Scanner 类的功能：可以实现键盘输入数据到程序当中
引用类型的一般使用步骤：
    导包：
        import 包路径，类名称;
        如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包不写
        只有Java.lang包下的内容不需要导包，其他的包都需要import语句
    创建：
        类名称 对象名 = new 类名称();
    使用：
        对象名.方法名();
 */

import java.util.Scanner;

public class NewTeacher {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        //获取键盘输入的字符串
        System.out.print("请输入姓名：");
        String getName = sc.next();
        //获取键盘输入数字
        System.out.print("请输入年龄：");
        int getAge = sc.nextInt();
        t.setName(getName);
        t.setAge(getAge);
        System.out.println("你的名字是："+t.getName()+"你的年龄是："+t.getAge());
        add();
    }
    public static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        int result = a +b ;
        System.out.println("你们之间的和为："+result);
        return result;
    }
}
