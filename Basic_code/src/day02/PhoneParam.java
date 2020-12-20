package day02;

public class PhoneParam {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "apple";
        p.price = 10000;
        p.color = "黑色";
        method(p);
    }
    //当一个对象作为参数，传递到方法中时，实际上传递进去的是对象的地址值
    public static void method(Phone param){
        System.out.println(param.color);
        System.out.println(param.brand);
        System.out.println(param.price);
    }
}
