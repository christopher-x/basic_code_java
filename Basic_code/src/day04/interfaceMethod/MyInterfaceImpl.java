package day04.interfaceMethod;

public class MyInterfaceImpl implements InterfaceMethod {

    @Override
    public void methodAbs() {
        System.out.println("第一个方法");
    }

    @Override
    public void methodAbs1() {
        System.out.println("第二个方法");
    }
}
