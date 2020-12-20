package MethodInterface;

/*
    函数式接口：有且只有一个抽象方法的接口，称之为函数式接口
    当然接口中可以包含其他方法（默认，静态，私有）
    格式：
        修饰符 interface 接口名称{
            public abstract 返回值类型 方法名称（可选参数信息）；
            //其他抽象方法内容
        }
        @FunctionalInterface
        作用：
            可以检测接口是否是一个函数式接口
            是：编译成功
            否：编译失败（接口中没有抽象方法，或抽象方法的个数多余一个

 */

@FunctionalInterface

public interface MyFunctionInterface {
    public abstract void method();
}
