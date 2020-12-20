package day04;

/*
如果一个变量使用了static进行修饰，那么该变量便不属于
 */
public class StudentMethod {
    private String name;
    private int age;
    private int id ;
    private static int num = 0 ;
    private static String classRoom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public StudentMethod() {
        num++;
    }

    public StudentMethod(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
