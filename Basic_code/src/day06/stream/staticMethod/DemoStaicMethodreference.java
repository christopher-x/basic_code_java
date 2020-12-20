package day06.stream.staticMethod;

/*
    通过类名引用静态成员方法
    类已经存在，静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class DemoStaicMethodreference {
    //定义一个方法，方法的参数传递要计算绝对值和整数，和函数式接口Calcable

    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，和lambda表达式
        int number = method(-10,(n)->
           //对参数进行绝对值计算，并返回结果
            Math.abs(n)
        );
        System.out.println(number);
        //使用方法引用优化lambda表达式
        //math类是存在的
        //
        int number1 = method(-10,Math::abs);
        System.out.println(number1);
    }
}
