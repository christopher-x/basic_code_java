package day02;

/*
定义一个类，用来模拟手机事务
属性：品牌，价格，颜色
行为：打电话，发短信

成员变量：（属性）
    String brand;
    double price;
    String color;
成员方法：（行为
    public void call (String who) {}
    public void sendMessage(){}
 */
public class Phone {
    //成员变量
    String brand;   //品牌
    double price;   //价格
    String color;   //颜色

    public void call(String name ){

        System.out.println("打电话给："+name+"我的手机颜色是"+color);
    }
    public void sendMess(String name){
        System.out.println("发短信给："+name);
    }
}
