package day03;

import java.util.Scanner;

/*
    需求分析：
        1。使用数组保存已经注册过的用户名（数据库）
        2。使用Scanner获取用户输入的注册的用户名（前端，页面）
        3。定义一个方法，对用户输入的用户名进行判断
            编译存储已经注册过用户名的数组，获取每一个用户名
            使用获取到的用户名和用户输入的用户名比较
                true：
                    用户名已存在，抛出异常：RegisterException
                false：
                    继续遍历
             如果循环结束，并未找到存在的用户：提示用户注册成功！！！
 */
public class RegisterExceptionMethod {
        static String [] usernames = {"张三","里斯","网速"};



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        checkUserName(user);

    }
    public static void checkUserName(String user){
        for (String name : usernames) {
            try {
                if (name.equals(user)){
                    throw new RegisterException("用户名已存在！");
                }
            }catch (RegisterException e){
                e.printStackTrace();
                return ;
            }
        }
        System.out.println("注册成功");
    }

}
