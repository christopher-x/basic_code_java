package day02;

/*
一旦使用private进行修饰，在本类中可以直接访问，超出本类之后就会无法访问
 */
public class Person {
    String name ;
    private int age ;
    public void show(){

        System.out.println("我的年龄是："+age+"我叫："+name);
    }
    public void setAge(int setAge){
        if(setAge< 100 && setAge > 0){
            age = setAge;
        }else{
            System.out.println("输入不正确，请重新输入");
        }
    }
    public int getAge(){
        return age;
    }
}
