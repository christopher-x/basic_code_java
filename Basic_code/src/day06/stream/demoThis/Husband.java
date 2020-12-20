package day06.stream.demoThis;

/*
通过this引用本类的成员方法

 */
public class Husband {
    //定义一个买房子的方法
    public void buyHouse() {
        System.out.println("在北京买一套四合院");
    }

    //定义一个结婚的方法，参数传递RichAble接口
    public void married(RichAble r) {
        r.buy();
    }

    //定义一个高兴的方法
    public void soHappy() {
        //调用结婚的方法，方法的参数RichAble是一个函数式接口，传递Lambda表达式
//        married(()->{
//            //使用this成员方法，调用本类买房子的方法
//            this.buyHouse();
//        });

        /*
        使用方法引用优化lambda表达式
        this是已经存在的
        本来的成员方法buyhouse是已经存在的
        所以我们可以通过直接使用this引用本类的成员方法buyhouse
         */
        married(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
