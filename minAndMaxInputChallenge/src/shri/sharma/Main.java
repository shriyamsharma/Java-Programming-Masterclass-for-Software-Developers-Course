package shri.sharma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {

                int num = scanner.nextInt();

                if(first) {
                    first = false;
                    min = num;
                    max = num;
                }

                if (num > max) {
                    max = num;

                if (num < min) {
                    min = num;
                }

                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }
}
