package shri.sharma;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getInteger(5);
        int[] sorted = sortInteger(myInteger);
        printArray(sorted);
    }

    public static int[] getInteger(int array) {
        int[] myInt = new int[array];
        System.out.println("Enter " + array + " integer values : \r");
        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = scanner.nextInt();
        }
        return myInt;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " contents " + array[i]);
        }
    }

    public static int[] sortInteger(int[] array) {
        int[] sortedArray = new  int[array.length];
        for (int i=0; i< array.length; i++) {
            sortedArray[i] = array[i];
        }

        //Also instead of above code we can also do
//        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //element 0 = 50
            //element 1 = 160
            //element 2 = 40

            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
        //after this loop executed
        //element 0 = 160
        //element 1 = 50
        //element 2 = 40
    }
}
