package day02;
/*
对于基本类型中的Boolean值，getter方法一定要写成isxxx的形式，而set不变
this关键字：
    如果需要访问成员变量，使用this.参数名
    通过调用方法，那么谁就是this
 */
public class Student {
    private String name;
    private int age ;
    private boolean male;

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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
