package day02;
/*
方法其实就是若干语句的功能集合
    方法好比一个工厂：
        蒙牛： 原料：奶牛，饲料，水   产出物：奶粉，牛奶，各种奶制品
        钢铁厂：  原料：铁矿石，煤炭，水    产出物：钢铁建材
    参数：各种工厂的原料
    返回值：各种工厂的产出物

定义方法格式：
    修饰符 返回值类型   方法名称(参数类型 参数名称.....){
        方法体
        return 返回值；
    }
    修饰符：public static
    返回值类型：int double char long String boolean
    方法名称：方法名与变量规则一样，使用小驼峰命名法
    参数类型：进入方法的数据是什么类型
    参数名称：进入方法的数据对应的变量名称
    返回值必须和返回值一致
方法调用格式：
    单独调用：方法名称(参数)；
    打印调用：System.out.print(方法名称(参数));
    赋值调用：数据类型 变量名称：方法名称(参数)；
    注：
        没有返回值的方法只能使用单独调用
 */
public class DemoMethod {
    public static void main(String[] args) {
        printMethod("张三",22);
        int sum2 = sum(30,50);
        System.out.println("返回值结果"+sum2);
    }
    public  static void printMethod(String name,int age){
        System.out.println("大家好，我是："+name+"，我今年"+age+"岁");
    }
    public static int sum(int x ,int y){
        int sum1 = x + y ;
        System.out.println("当前值和为："+sum1);
        return sum1;

    }
}
