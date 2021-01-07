package shri.sharma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int counter = 0;
            int sum = 0;
            while (counter < 10) {
                int order = counter + 1;
                System.out.println("Enter Number #" + order + ": ");

                boolean hasNextInt = scanner.hasNextInt();

                if (hasNextInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;

                } else {
                    System.out.println("Invalid Input");
                }

                scanner.nextLine();
            }
        System.out.println("The sum is: "+ sum);

        scanner.close();
    }
}
