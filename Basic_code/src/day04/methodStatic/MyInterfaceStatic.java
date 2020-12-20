package day04.methodStatic;

/*
从Java8开始，接口当中允许定义静态方法
格式：
    public static 返回值类型 方法名称（参数列表）{
        方法体
    }
就是将abstract或者default换成static即可，带上方法体
 */
public class MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是一个静态方法体");
    }
}
