package day02;

/*
局部变量和成员变量
1：定义的位置不一样
    局部变量：在方法体内部
    成员变量：在方法的外部，直接写在类体中
2：作用范围不同
    局部变量：只有方法当中才可以使用，出了方法体就无法使用
    成员变量：整个类都可以使用改变量
3：默认值不同
    局部变量：没有默认值，如果需要使用，必须手动赋值
    成员变量：如果没有赋值，会有你默认值，规则和数组一致
 */
public class DemoVariableDifference {
    private String name;

    public static void main(String[] args) {
        String name;
        //System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}