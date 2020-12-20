package day02;

/*
    一个方法可以有多个参数，但是只有0或者1个返回值，不能有多个返回值
    如果希望一个方法当中产生了多个结果数据进行返回，可以使用一个数组作为返回值类型即可
 */
public class DemoArrayReturn {
    public static void main(String[] args) {
        int [] result = calculate(30,300,3000);
        System.out.println("总和："+result[0]);
        System.out.println("平均数"+result[1]);
        System.out.println("当前数组为："+result);
    }
    public static int[] calculate(int a ,int b ,int c){
        int sum = a + b + c ;
        int avg = sum / 3 ;
        int [] array = new int[2];
        array[0] = sum ;
        array[1] = avg;
        return array;
    }
}
