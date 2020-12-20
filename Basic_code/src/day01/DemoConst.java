package day01;

/*
 常量：
    1：字符串常量：凡是用双引号包裹的数据，都叫做字符串常量。例："hello" "123"
    2：整型常量：例如：100，200，-500
    3：浮点数常量：包含小数点的数字。例：2.1
    4：字符常量：使用单引号包裹起来的数据，都叫做字符常量。例：'hello'
    5：布尔常量：true、false。
    6：空常量：null。代表没有任何数据
 */

public class DemoConst {
    public static void main(String[] args){
        System.out.println("我是字符串常量"+"hello");
        System.out.println("握手字符常量"+'a');
        System.out.println("浮点数常量"+3.14);
        System.out.println("整数常量"+500);
        //必须要在
        System.out.println(" ");
        System.out.println(true);
    }
}
/*
    基本数据类型：
        四类八种：
        整数型：byte short int long
        浮点型：float double
        字符型：char
        布尔型：boolean
    引用数据类型：
        字符串
        数组
        类
        接口
        lambda
    注意：
    1：字符串不是基本类型，而是引用类型
    2：浮点型可能只是一个近似值，并非精确的值
    3：数据范围与字节数不一定相关，例如float数据范围比long更加广泛，但是float为4字节，long为8字节
    4：浮点数当中默认类型为double，如果一定要使用float类型，则需要加一个后缀F
    5：如果是整数，则默认使用int，如果需要使用long类型，则在最后加上L
 */

