package day06.Junit;

/*
    计算器类：

 */
public class CalculatorTest {

    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用
        int add = c.add(1, 2);
        System.out.println(add);
        int result = c.sub(22,33);
        System.out.println(result);
    }
}
