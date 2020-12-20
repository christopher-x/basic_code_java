package day02;

public class DemoArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,6,7,8,9,1,3,5,6,4,2,3,4,6,45,8,79,34,3,2,1,3,5,4,6,8,4,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int min = 0,max = array.length -1 ;min < max ; min++ , max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
