package day02;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();
注意：
    匿名对象只能使用唯一的一次，下次再用时，重新创建一次新对象
建议:
    如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */

import java.util.Scanner;

public class DemoAnother {

    public static void main(String[] args) {
        System.out.println();
        NewDemoAnother nd = new NewDemoAnother();
        nd.name = "张飞";
        nd.showName();

        //匿名对象
        new NewDemoAnother().name="狗子";
        new NewDemoAnother().showName();

//        int num = new Scanner(System.in).nextInt();
//        System.out.println("你输入的参数为："+num);

        methodParam(new Scanner(System.in));
    }
    public static void methodParam(Scanner sc){
        System.out.print("请输入参数：");
        int num = sc.nextInt();
        System.out.println("你输入的参数为："+num);

    }
}
