package day05.Net.io;


import java.io.Serializable;

/*
    序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
    类通过实现java.day05.Net.io.Serializable接口以启用序列化狗狗能，未实现此接口的类将无法使其任何状态序列化或反序列化
    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现该接口，就会给类添加一个一个标记
        当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
            有：就可以序列化和反序列化
            没有：抛异常
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
