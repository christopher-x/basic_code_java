package day04.Abstract;

/*
    抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束
    抽象类：抽象方法所在的类，必须是抽象类才行，在class之前写上abstract即可
使用：
    1. 不能直接创建new抽象类对象
    2. 必须用一个子类来继承抽象父类
    3. 子类必须覆盖重写抽象父类当中的所有抽象方法
        覆盖重写：子类去掉抽象方法的abstract关键字，然后补上方法体大括号；
    4.创建子类对象进行使用
 */
public abstract class MethodAbstract {
    public  abstract void eat();
    public abstract void sleep();
    public void animal(){
        System.out.println("这边的都是动物");
    }
}
