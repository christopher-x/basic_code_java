package day04;
/*
局部变量：   直接写
本来的局部变量     this.成员变量名
父类的成员变量     super.成员变量名

在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找
    无论是成员方法还是成员变量，如果没有就向上找父类，绝对不会向下找子类
重写(Override)
概念：在继承关系中，方法的名称一样，参数列表也一样
(重写)override：方法的名称一样，参数也一样
(重载)overload：方法的名称一样，参数列表不同
方法的覆盖重写特点：
    创建的是子类方法，则优先用子类方法
注意:
    子类方法的返回值必须小于等于父类的返回值范围
    子类方法的权限，必须大于等于父类方法的权限修饰符(public > protected > (default) >private
        default 不是关键字，默认裸奔就是default
 */
public class DemoFamilay {
    public static void main(String[] args) {
        DemoSun ds = new DemoSun();
        ds.method();
        ds.Method();
    }
}
