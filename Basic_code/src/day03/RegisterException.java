package day03;

/*
    自定义异常类
        java提供的异常类，不能满足实际使用时，我们可以自己定义一些异常类
    格式：
        public class eeeException extends Exception| RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
    注意：
        自定义异常类都是以Exception结尾，说明该类是一个异常类
        自定义异常类，必须得继承Exception或者是RuntimeException
            继承Exception //自定义的异常类是一个编译期异常，就必须处理这个异常，要么throws要么try...catch
            继承RuntimeException //那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理（中断程序）
 */
public class RegisterException extends Exception{
    //添加一个空参数的构造方法
    public  RegisterException(){
        super();
    }
    //添加一个带异常信息的构造方法
    public RegisterException(String s){
        super(s);
    }
}
