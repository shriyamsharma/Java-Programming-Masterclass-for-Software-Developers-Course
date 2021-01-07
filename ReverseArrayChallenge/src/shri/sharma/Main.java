package shri.sharma;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
//	    for (int i = 0; i < array.length; i++) {
        System.out.println("Array = " + Arrays.toString(array));
//    }
	    reverse(array);
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i =0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        int[] reverseArray = array;
//        for (int i =0; i < reverseArray.length; i++) {
            System.out.println("Reverse array = " + Arrays.toString(reverseArray));
//        }
    }
}
