package day06.stream.perMethod;

/*
定义一个创建Person对象的函数式接口
 */

@FunctionalInterface
public interface PersonBuild {
    //定义一个方法，根据传递的姓名，创建Person对象返回
    Person builderPerson(String name);

}
