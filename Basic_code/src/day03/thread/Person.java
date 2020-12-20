package day03.thread;

public class Person {
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void run(){
        for (int i = 0; i <= 20 ; i++) {
            System.out.println(name+i);
        }
    }
}
