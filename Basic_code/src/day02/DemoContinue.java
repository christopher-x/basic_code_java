package day02;

/*
    continue关键字：
        跳过当前次循环，马上开始下一次循环
 */
public class DemoContinue {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10; i++){
            if(i == 4){
                System.out.println("啦啦啦，跳过本层"+i);
                continue;
            }
            System.out.println("hi,当前的数字为："+i);
        }
    }
}
