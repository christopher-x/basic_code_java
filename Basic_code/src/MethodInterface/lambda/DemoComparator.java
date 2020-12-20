package MethodInterface.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {
    public static Comparator<String> getCompartor(){
//        return new Comparator<String>(){
//
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };
        return (o1,o2) ->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String [] arr ={"aaaa","bbb","aacc"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getCompartor());
        System.out.println(Arrays.toString(arr));
    }
}
