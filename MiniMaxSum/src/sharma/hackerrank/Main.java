package sharma.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ar = {7, 69, 2, 221, 8974};
        long min = 0, max = 0, sum = 0;
        min = ar[0];
        max = min;
        sum = min;

        for (int i=1; i< ar.length;i++) {
            sum += ar[i];
            if (ar[i] < min) {
                min = ar[i];
            }
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println((sum - max) + "  " + (sum - min));
        String s = "hackerarankl";
        System.out.println(s);

        Scanner scan =  new Scanner(System.in);

        scan.next()
    }

}
