package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10 ) {
            return -1;
        } else {
            int min;
            //extracting min value
            if(first < second) {
                 min = first;
            } else {
                min = second;
            }
            int gcd = 0;
            for (int i=min; i >= 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                    break;
                }
            }
            return gcd;
        }
    }
}


