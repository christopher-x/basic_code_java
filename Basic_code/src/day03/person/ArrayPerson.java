package day03.person;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayPerson {


    public static void main(String[] args) {
        Person[] p = {
                new Person("张飞",22),
                new Person("王麻子",21),
                new Person("张三",13),
                new Person("里斯",32),
                new Person("王武",33)
        };

//        Arrays.sort(p, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });


        Arrays.sort(p ,( o1, o2) ->{
            return o1.getAge() - o2.getAge();
        });


        for (Person person : p) {
            System.out.println(person);
        }
    }
}
