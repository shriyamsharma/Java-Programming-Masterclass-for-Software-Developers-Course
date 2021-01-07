package shri.sharma;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Value Type Example
	    int myIntValue = 10;
	    int anotherint = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherint);

        anotherint++;
        System.out.println(myIntValue);
        System.out.println(anotherint);

        // Reference Type Example

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("After changes myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After changes AnotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {1, 2, 5, 4, 5};
        modifyArray(myIntArray);
        System.out.println("After modify changes myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify changes AnotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 3;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
