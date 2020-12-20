package day03;

/*
throw关键字：
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new XXXexception（异常产生的原因）
        throw 关键字后边new的对象必须是exception或者exception的子类对象
        throw 抛出指定的异常对象，我们必须处理这个异常对象
            throw关键字后创建的是runtimeexception或者是runtimeexception的子类对象，默认交给jvm处理（打印异常，中断程序）
            throw关键字后创建的是编译异常，可以throws或者try catch
 */
public class ThrowMethod {

    public static void main(String[] args) {
        int arr[] = null;
        int a = getElement(arr, 1);
        System.out.println(a);

    }
    public static int getElement(int[] arr,int index){
        /*
            我们可以对传递过来的参数数组，进行合法性消炎
            如果数组arr的值为null
            那么可以抛出空指针异常，告知方法调用者，传递的数组的值为null
         */
        if(arr == null){
            throw new NullPointerException("空值你丢过来干几把。。。");
        }
        /*
            我们可以对传递过来的参数index进行合法性校验
            我们index的范围不在数组的索引范围内
            那么我们就抛出数组索引越界异常，告知方法的调用者"传递的索引超出了数组的使用范围
         */

        int ele = arr[index];

        return ele;
    }


}
