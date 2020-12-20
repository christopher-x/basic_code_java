package day04;

public class StringPrintTest {
    public static void main(String[] args) {
        int[] num = {1 ,2 , 3};
        String result = getStr(num);
        System.out.println(result);
    }

    public static String getStr(int[] num) {
        String str1 = "[";
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                str1 += "word" + num[i] + "]";
            } else {
                str1 += "word" + num[i] + "#";
            }
        }
        return str1;
    }
}
