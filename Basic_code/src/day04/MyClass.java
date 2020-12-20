package day04;

/*
一旦使用static修饰成员方法，那么这就是成了静态方法，静态方法不属于对象，而是属于类的
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用
如果使用了static关键字，那么不需要创建对象，直接就能通过类名称来使用

无论是成员变量还是成员方法，如果有了static，都推荐使用类名字进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注：
    静态只能访问静态，不能访问非静态
    原因：因为在内存当中是先有静态内容，后有非静态内容
    静态方法中不能使用this
    this代表当前对象，通过谁调用的方法，谁就是this
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println("这是一个普通的成员方法");
    }
    public static void method1(){
        System.out.println("这是一个静态方法");
    }
}
