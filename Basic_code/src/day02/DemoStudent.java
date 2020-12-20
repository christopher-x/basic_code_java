package day02;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
导包：import 包名称，类名称；
    对于和当前类属于同一个包的情况，可以省略导包语句不写。
创建，格式：
    类名称 对象吗 = new 类名称()
    student stu = new strudent()
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数
 */
public class DemoStudent {
    public static void main(String[] args) {
        DemoPrintArray dpa = new DemoPrintArray();
        dpa.eat();
        dpa.name = "好多鱼";
        System.out.println(dpa.name);

    }
}
