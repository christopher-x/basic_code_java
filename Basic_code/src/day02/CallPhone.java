package day02;

public class CallPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.color = "黑色";
        p.call("张三");
        System.out.println(p.color);
    }
}
