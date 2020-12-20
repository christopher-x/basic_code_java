package day02;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone p1 = getPhone();
        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.color);
    }
    public static Phone getPhone(){
        Phone p = new Phone();
        p.brand = "三星";
        p.price = 0.3;
        p.color = "yellow";
        return p;
    }
}
