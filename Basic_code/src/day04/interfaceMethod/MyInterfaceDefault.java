package day04.interfaceMethod;

/*
从Java8开始，接口里允许定义默认方法
格式：
    public default 返回值类型 方法列表(参数列表){
        方法体
    }
注：接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("这是一个默认方法");
    }
}
