package day03;

public class tryCatchFinallyMethod {
    public static int getA(){
        int a = 10;
        try {
            return a;
        }catch (Exception e ){
            System.out.println(e);
        }
        finally{
            a = 100;
            return a;

        }
    }

    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }
}
