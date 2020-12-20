package day03.cooker;

public class DemoCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("eating");
            }
        });

        //使用lambda表达式，简化匿名类内部书写
        invokeCook(()->{
            System.out.println("吃饭了～");
        });

        //优化lambda
        invokeCook(()-> System.out.println("吃饭了～"));


    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
