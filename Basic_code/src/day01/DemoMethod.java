package day01;

/*
    定义一个方法：
        public static void 方法名称(){
            方法体
        }
    方法的名称和命名规则以及变量一样，使用小驼峰命名法
    方法体：也就是大括号当中可以包含任意条语句

注意：
    方法定义的先后顺序无所谓
    方法的定义不能产生嵌套包含关系

方法的调用：
    方法名称()
 */
public class DemoMethod {
    public static void main(String[] args) {
        String name = "张三";
        human(name);
        farmer();
        cook();
        seller();
    }
    public static void human(String name){
        System.out.println("我是一个人类，我叫"+name);
    }
    public static void farmer(){
        System.out.println("我要种地");
    }
    public static void cook(){
        System.out.println("我是厨子");
    }
    public  static void seller(){
        System.out.println("我是商贩");
    }
}
