package day06.stream.DemoPrint;

/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的，成员方法是已经存在的
    就可以使用对象名来引用成员方法
 */
public class MethodRerObjectTest {
    //定义一个方法，方法的参数传递Printable接口

    public static void printString(Printable p ){
        p.print("hello");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递lambda表达式

        printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject mro = new MethodRerObject();
            mro.printUpperCaseString(s);
        });
        /*
        使用方法引用优化lambda
        对象是已经存在的，MethodRerObject
        成员方法也是已经存在的printUpperCaseString
        所以可以使用对象名引用成员方法
         */
        MethodRerObject mro = new MethodRerObject();
        printString(mro::printUpperCaseString);
    }
}
