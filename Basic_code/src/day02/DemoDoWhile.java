package day02;

/*
do while 循环至少会执行一次
do while
    do{
        循环体
        步进语句
    }
    while (条件){
        循环体
    }
 */
public class DemoDoWhile {
    public static void main(String[] args) {
        int num = 10;
        do{
            System.out.println("张三你好"+num);
            num++;
        }while(num < 20);
    }
}
