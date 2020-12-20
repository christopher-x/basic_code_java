package day04.interfaceMethod;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法

如何定义一个接口的格式：
public interface 接口名称{
    接口内容

1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法
}
在任何版本的Java中，接口都能定义抽象方法
public abstract 返回值类型 方法名称（参数列表）;
1.接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2.这两个关键字修饰符，可以选择性省略。
3.方法的三要素，可以随意定义。


使用方式：
    1.接口不能直接使用，必须有一个实现类来实现该接口
        格式：public class 实现类名称 implements 接口名称{....}
    2.接口的实现类，必须覆盖重写接口中所有的抽象方法
        去掉abstract关键，加上方法体大括号
    3.创建实现类的对象，进行使用

注：如果实现类并没有覆盖重写接口中的所有的抽象方法，那么这个实现类自己就必须是抽象类


 */
public interface InterfaceMethod {

    //抽象方法
    public abstract void methodAbs();
    void methodAbs1();
}
