package anytest;


import day06.Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        //int i = 10/0;
        System.out.println("aaaaa");
        int a = c.add(11,22);
        int a1 = c.sub(33,22);
        System.out.println(a);
        System.out.println(a1);
        //断言，第一个值为期望值，第二个值为预算的结果
        Assert.assertEquals(11,a1);
    }

    @Before
    public void init(){
        /*
            该方法为初始化方法：
                用于资源申请，所有测试方法在执行之前都会先执行该方法
         */
        System.out.println("来了老弟～");
    }

    @After
    public void close(){
        System.out.println("最后一个执行，然后自己关闭");

    }
}
