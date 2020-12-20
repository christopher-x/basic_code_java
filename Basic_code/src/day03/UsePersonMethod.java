package day03;

public class UsePersonMethod {
    public static void main(String[] args) {
        PersonMethod[] p = new PersonMethod[3];
        System.out.println(p[1]);
        PersonMethod one = new PersonMethod("张飞",20);
        PersonMethod two = new PersonMethod("刘备",50);
        PersonMethod three = new PersonMethod("张三",40);

        p[0] = one;
        p[1] = two;
        p[2] = three;
        System.out.println(p[1]);
    }
}
