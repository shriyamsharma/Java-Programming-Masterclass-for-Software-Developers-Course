package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            if (number < 10) {
                firstDigit = number;
            }
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
