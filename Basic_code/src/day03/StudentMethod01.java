package day03;

public class StudentMethod01 {

    private String name ;
    private int age;

    public StudentMethod01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentMethod01() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
