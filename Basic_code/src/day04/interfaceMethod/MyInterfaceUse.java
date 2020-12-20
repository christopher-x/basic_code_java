package day04.interfaceMethod;

/*
接口的默认方法，可以通过接口实现类对象，直接调用
接口的默认方法，也可以被接口实现类进行覆盖重写
 */
public class MyInterfaceUse extends MyInterfaceDefaultA{
    public static void main(String[] args) {
        MyInterfaceDefaultA md = new MyInterfaceDefaultA();
        md.methodDefault();
        md.methodAbs();
        MyInterfaceImpl md1 = new MyInterfaceImpl();
        md1.methodAbs();
        md1.methodAbs1();
    }
}
