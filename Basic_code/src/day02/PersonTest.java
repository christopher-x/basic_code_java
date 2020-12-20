package day02;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(30);
        p.name = "张三";
        int b = p.getAge();
        System.out.println(b);
        p.show();
    }
}
