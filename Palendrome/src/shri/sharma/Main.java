package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-535));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if (originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
