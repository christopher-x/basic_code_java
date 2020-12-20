package day04.extends1;

public class Sun extends Father{
    int num = 30;

    @Override
    public void method() {
        super.method();
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println("Sun method");
    }
}
