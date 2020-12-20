package day04.Abstract;

public class DogMethod extends CatMethod{
    public static void main(String[] args) {
        CatMethod c = new CatMethod();
        c.eat();
        c.sleep();
        c.animal();
    }
}
