package day03.calc;

public class CalcMainMethod {
    public static void main(String[] args) {
//        Calculator c = new Calculator() {
//            @Override
//            public int calc(int a, int b) {
//                return a+b;
//            }
//        };
//        int a = c.calc(20,30);
//        System.out.println(a);

        Method(20, 30, new Calculator() {
            @Override
            public int calc(int a, int b) {

                return a + b ;
            }
        });

        Method(120,130,(int a ,int b )->{
            return a+b;
        });
    }
    /*
    定义一个方法：传递两个int参数。
     */
    public static void Method(int a, int b ,Calculator calculator){
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }
}
