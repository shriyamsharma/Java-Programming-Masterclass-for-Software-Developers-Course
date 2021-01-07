package shri.sharma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divideLBYL(x, y));
        System.out.println("Enter Integer value: ");
        int i = getIntEAFP();

        System.out.println("VALUE of x is " + i);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        Boolean isValid = true;
        String input = s.next();
        for (int i =0; i<input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    public static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    public static int divideLBYL(int x, int y){
        if (y != 0){
            return x/y;
        } else {
            return 0;
        }
    }

    public static int divideEAFP(int x, int y) {
        try{
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
