package sharma.hackerrank;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(n, arr);
    }

    public static void plusMinus(int n, int[] arr) {
        DecimalFormat df = new DecimalFormat("#.######");
        double posCount =0;
        double negCount = 0;
        double zeroCount = 0;


        for (int i =0; i< arr.length; i++) {
            if (arr[i] < 0){
                negCount = negCount + 1;
            }
            if (arr[i] > 0) {
                posCount = posCount + 1;
            }
            if (arr[i] == 0){
                zeroCount++;
            }
        }
        double pos = posCount/n;
        double neg = negCount/n;
        double zero = zeroCount/n;
        System.out.println(df.format(pos));
        System.out.println(df.format(neg));
        System.out.println(df.format(zero));
    }
}
