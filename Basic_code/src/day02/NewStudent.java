package day02;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
格式：
    public 类名称（参数类型 参数名称）{
        方法体
    }
注意：
    构造方法的名称必须和所在的类名称完全一致（大小写
    构造方法不要写返回值，void都不需要写
    构造方法不能return任意一个具体的返回值
    如果没有编写任何构造方法，那么编译器将会默认添加一个构造方法，没有参数，方法体，方法体内什么都不做
    一旦编写了至少一个构造方法，那么编译器将不会默认添加
    构造方法也是可以进行重载：
        方法名称相同，参数列表不同
 */
public class NewStudent {
    private String name ;
    private int age;
    public NewStudent(){
        System.out.println("无参构造方法执行了。");
        System.out.println(this);
    }
    public NewStudent(String name ,int age ){
        this.setName(name);
        this.setAge(age);
        System.out.println("带参构造方法执行啦。"+name+age);
        System.out.println(this.getAge());
        System.out.println(this.age);
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
