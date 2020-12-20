package day03;

import java.util.ArrayList;

/*
ArrayList 常用方法：
    public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致
        注：对于ArrayList集合来说，Add添加动作是一定会成功，所以返回值可用可不用
    public E get(int index): 向集合中获取元素，参数是索引编号，返回值就是对应位置的元素
    public E remove(int index):从集合中删除元素，参数是索引编号，返回值就是对应的元素
    public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */
public class ArrayListMethod01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("王麻子");
        list.add("卤蛋");
        list.add("???");
        System.out.println(list);
        boolean success = list.add("张飞");
        String whosRemove = (String) list.remove(3);
        System.out.println(list);
        int lony = list.size();
        System.out.println(lony);
        System.out.println("添加的动作是否成功:"+success);

    }
}