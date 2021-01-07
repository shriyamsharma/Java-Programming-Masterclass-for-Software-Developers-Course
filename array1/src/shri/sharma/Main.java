package shri.sharma;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getInteger(5);
	    for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Elements " + i + " typed was " + myIntegers[i]);
        }
        System.out.println("The Average is " + average(myIntegers));

    }

    public static int[] getInteger(int num) {
        System.out.println("Enter " + num + " integer values.\r");
        int[] values = new int[num];

        for (int i =0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i =0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
