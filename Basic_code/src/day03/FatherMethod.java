package day03;

/*
子父类的异常
    如果父类抛出了多个异常，子类重新给父类方法时，抛出的父类相同的异常或者父类异常的子类或者不抛出异常
    父类方法没有抛出异常，子类重写该方法时也不可抛出异常，此时子类产生异常，只能捕获处理，不能声明抛出
    注意：
        父类异常时什么样，子类异常就是很么样
 */
public class FatherMethod {
    public void show01() throws NullPointerException,ClassCastException{

    }
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}

}
class zi extends FatherMethod{
    //子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法时，抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    public void show03(){}
    public void show04() {}
}