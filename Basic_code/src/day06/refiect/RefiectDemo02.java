package day06.refiect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class RefiectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        String name = personClass.getName();
        System.out.println(name);

        ClassLoader classLoader = RefiectDemo02.class.getClassLoader();
        //加载配置文件
        Properties pro = new Properties();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);

        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载该类进内存
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
