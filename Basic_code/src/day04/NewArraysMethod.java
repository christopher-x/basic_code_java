package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewArraysMethod {
    public static void main(String[] args) {
        String str = "dsjdhaskdhsaurlfwwehf829dsfa";
        char chars[] = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
