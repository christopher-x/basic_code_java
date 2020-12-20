package day02;
/*
一个标准的类通常要拥有四个组成部分
    所有的成员变量都要使用private关键字修饰
    为每一个成员变量编写一对，get、set方法
    编写一个无参数的构造方法
    编写一个全参数的构造方法
 */
public class Teacher {
    private String name;
    private int age ;

    public Teacher() {
        super();
    }
    public Teacher(String name ,int age){
        this.name = name;
        this.age = age;
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
