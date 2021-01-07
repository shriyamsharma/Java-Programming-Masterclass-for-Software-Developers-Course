package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num2 < 10) || (num1 > 99 || num2 > 99)) {
            return false;
        } else {
            int lastdigit1 = num1 % 10;
            int lastdigit2 = num2 % 10;
            int fdigit1 = num1 / 10;
            int fdigit2 = num2 / 10;
            if ((lastdigit1 == lastdigit2) || (lastdigit1 == fdigit2)) {
                return true;
            }
            if ((fdigit1 == fdigit2) || (fdigit1 == lastdigit2)) {
                return true;
            }
            return false;
        }
    }
}
