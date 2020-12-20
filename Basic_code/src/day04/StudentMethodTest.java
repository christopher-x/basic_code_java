package day04;

public class StudentMethodTest {


    public static void main(String[] args) {
        StudentMethod sm = new StudentMethod();
        sm.setClassRoom("麻辣烫");
        System.out.println(sm.getClassRoom());
        StudentMethod sm1= new StudentMethod("张飞",22);
        StudentMethod sm2 = new StudentMethod("阿黄",21);
        sm.setClassRoom("101");
        sm1.setClassRoom("202");
        System.out.println("姓名为："+sm1.getName()+
                "学号是："+sm1.getId()+
                "教室为："+sm1.getClassRoom()+
                "年龄为"+sm1.getAge());
        System.out.println("姓名为："+sm2.getName()+
                "学号是："+sm2.getId()+
                "教室为："+sm2.getClassRoom()+
                "年龄为"+sm2.getAge());
    }
}
