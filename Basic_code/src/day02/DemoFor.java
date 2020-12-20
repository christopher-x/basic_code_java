package day02;
/*
for(初始化表达式；布尔表达式；步进表达式){
    循环体
}
执行顺序：初始化表达式 >> 布尔表达式 >> 循环体 >> 步进表达式
 */
public class DemoFor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            System.out.println("当前的数值为："+i);
        }
    }
}
