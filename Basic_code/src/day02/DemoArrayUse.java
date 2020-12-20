package day02;

/*
    整数类型：那么默认为0
    浮点数类型，默认为0.0
    如果是字符类型，默认为"\u0000"
    如果是布尔类型，那么默认为false
    如果是引用类型，那么默认为null
 */
public class DemoArrayUse {
    public static void main(String[] args) {
        int [] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        array[1] = 999;
        array[2] = 9999;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //
        int array1[] = array;
        System.out.println(array1);
        array1[1] = 9;
        array1[2] = 300;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);


        //引用后的数组
        System.out.println("************");
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
