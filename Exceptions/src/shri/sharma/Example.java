package shri.sharma;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform decisio, autopilot shutting down");
        }

    }
    private static int divide(){

        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x/y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No suitable input.");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("attempting the divide by zero");
//
//        }

    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value: ");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please Enter Valid no ");
            }
        }
    }



}
