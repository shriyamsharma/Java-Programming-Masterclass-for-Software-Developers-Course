package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of number is "  + sumDigits(1454));
        System.out.println(sumDigits(-12));
        System.out.println(sumDigits(1));
    }
    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
            int sum = 0;
        while (number > 0) {
            //extract lsb
            int digit = number % 10;
            sum += digit;
            // drop lsb
            number /= 10;
        }
        return sum;
        }
}

