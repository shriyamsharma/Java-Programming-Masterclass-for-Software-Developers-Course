package shri.sharma;

public class Main {

    public static void main(String[] args) {
        printFactor(30);
    }

    public static void printFactor(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i=1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
