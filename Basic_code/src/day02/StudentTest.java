package day02;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张飞");
        s.setAge(35);
        s.setMale(true);

        System.out.println(s.isMale());
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
