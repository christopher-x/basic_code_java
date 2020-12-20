package day06.refiect;

public class RefiectDemo01 {
    public static void main(String[] args) throws Exception{
        //Class.forName("全类名")
        /*
        这种方式：多用于配置文件，读取文件，加载类
         */
        Class<?> aClass = Class.forName("day06.refiect.Person");
        System.out.println(aClass);

        //2.类名点Class
        /*
        多用于参数的传递
         */
        Class cls = Person.class;
        System.out.println(cls);

        //3.对象.getClass();
        /*
        多用于对象的获取字节码的方式
         */
        Person p = new Person();
        Class p1 = p.getClass();
        System.out.println(p1);

        //结论：同一个字节码文件（*.class）在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class，都是同一个
        System.out.println(aClass==p1 && aClass == cls);
    }
}
