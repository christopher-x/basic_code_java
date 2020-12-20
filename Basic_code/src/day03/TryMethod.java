package day03;

import java.io.IOException;

/*
    try.....catch：异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接受try中抛出的异常对象){
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的呃信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名）{
        }
    注：
        try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        如果try中铲射高了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try catch之后的代码

 */
public class TryMethod {
    public static void main(String[] args) {
        try{
            readFile("d:\\1txt");
        }catch (IOException e ){
            System.out.println("小老弟，你这个操作不对啊～");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("我在外围");
    }
    public static void readFile(String fileName) throws IOException{
        if(!fileName.endsWith("d://1txt")){
            throw new IOException("文件后缀名不对，憨批");
        }
        System.out.println("牛皮～！");
    }
}
