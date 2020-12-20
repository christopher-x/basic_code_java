package day06.stream.perMethod;

/*
    类的构造器，（构造方法）引用

  */
public class Demo {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void printName(String name ,PersonBuild pb){
        Person p = pb.builderPerson(name);
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        printName("张飞",(name )->new Person(name));
        printName("张麻子",Person::new);
    }
}
