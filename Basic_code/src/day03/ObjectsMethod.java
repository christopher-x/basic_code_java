package day03;

import java.util.Objects;

public class ObjectsMethod {
    public static void main(String[] args) {
        //对传递过来的参数进行合法性判断，判断是否为空
        method(null);
    }

    public static void method(Objects obj){
//        if(obj == null ){
//            throw new NullPointerException("空指针异常");
//        }
        Objects.requireNonNull(obj,"憨批，空指针异常了");
    }
}
