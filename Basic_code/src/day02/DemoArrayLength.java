package day02;
/*
如何获取数组的长度：
    数组名称.length
    数组一旦创建，程序运行期间，长度不可改变
 */
public class DemoArrayLength {
    public static void main(String[] args) {
        int arrayA[] = new int [99];
        int [] arrayB ={10,11,1,1,23,54,5,6,8,7,6,4,5,6,6,4,6,46,0,6,446,4};
        System.out.println(arrayB.length);
    }
}
