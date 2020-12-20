package day03;

import java.util.ArrayList;

public class StudentMethod02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        StudentMethod01 st = new StudentMethod01("zhangsan",21);
        StudentMethod01 zs = new StudentMethod01("zhann",22);
        StudentMethod01 mz = new StudentMethod01("mazi",18);
        StudentMethod01 dz = new StudentMethod01("duizhang",41);

        list.add(st);
        list.add(zs);
        list.add(mz);
        list.add(dz);
        for (int i = 0; i < list.size(); i++) {
            StudentMethod01 stu = (StudentMethod01) list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }
}
