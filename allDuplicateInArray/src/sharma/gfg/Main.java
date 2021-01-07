package sharma.gfg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-2,2,5,-11,6};
        int max=  Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                max = Math.max(arr[i], arr[j]+arr[i]);
            }
        }
        System.out.println(max);
    }

}
