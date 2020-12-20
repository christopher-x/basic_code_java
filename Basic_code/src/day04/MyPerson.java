package day04;

/*
静态代码块会在调用的时候自动执行，有并且只有一次
    执行顺序优先于构造方法！
静态代码块的典型用途
    用来一次性的针对静态成员变量进行赋值
 */
public class MyPerson {

    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
    }
}
