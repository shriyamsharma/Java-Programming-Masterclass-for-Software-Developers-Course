package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if ((num1 < 10 || num2 <10 || num3 <10) || (num1 > 1000 || num2 >1000 || num3 >1000)) {
            return false;
        } else {
            int lastdigit1 = num1% 10;
            int lastdigit2 = num2 % 10;
            int lastdigit3 = num3 % 10;
            if ((lastdigit1 == lastdigit2) || (lastdigit1 == lastdigit3) || (lastdigit2 == lastdigit3)) {
                return true;
            }
            return false;
        }
    }
    public static boolean isValid(int num) {
        if (num < 10 || num > 1000 ) {
            return false;
        }
        return true;
    }
}
