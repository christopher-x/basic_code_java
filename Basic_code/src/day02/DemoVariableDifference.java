package day02;
/*
局部变量和成员变量
1：定义的位置不一样
    局部变量：在方法体内部
    成员变量：在方法的外部，直接写在类体中
2：作用范围不同
    局部变量：只有方法当中才可以使用，出了方法体就无法使用
    成员变量：整个类都可以使用改变量
3：默认值不同
    局部变量：没有默认值，如果需要使用，必须手动赋值
    成员变量：如果没有赋值，会有你默认值，规则和数组一致
4：内存的位置不同
    局部变量：位于栈内存
    成员变量：位于堆内存
5：生命周期不同
   局部变量：随着方法进栈诞生，随着方法出栈而消失
   成员变量:随着对象创建而诞生，随着对象被垃圾回收而消失
 */
public class DemoVariableDifference {
    String name ;
    public void methodA(){
        int num = 20;
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){
        int age ;
        System.out.println(param);
    }

}
