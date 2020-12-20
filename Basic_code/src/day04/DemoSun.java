package day04;

public class DemoSun extends DemoFather{
  int num =20;
  public void method(){
      int num = 30;
      System.out.println(num);//局部变量
      System.out.println(this.num);//本类的成员变量
      System.out.println(super.num);//父类的成员变量
  }
  @Override
  public  void Method(){
      System.out.println("子类重名方法执行");
  }
}
