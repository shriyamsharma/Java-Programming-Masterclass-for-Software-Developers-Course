package sharma.hackerrank;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int ar[] = {3, 2, 1, 4};
        System.out.println(birthdayCakeCandles(ar));
    }

    public static int birthdayCakeCandles(int ar[]){


//        Arrays.sort(ar);
//        int last = ar[n-1];
//        int count = 0;
//        for (int i = ar.length-1; i > 0; i--){
//            if (last == ar[i]) {
//                count++;
//            }
//        }
//        return count;


        int max = 0;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]){
                max = ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++){
            if (max == ar[i]){
                count++;
            }
        }
        return count;


    }

}
