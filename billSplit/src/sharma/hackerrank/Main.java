package sharma.hackerrank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 4, 4, 5, 3};
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(int[] arr){
        int[] arr1 = new int[arr.length];

        int max = 0;

        for (int var : arr){
            arr1[var]++;
            max = Math.max(max, arr1[var]);
        }

        for (int i =0; i< arr.length; i++){
            if (arr1[i] == max){
                return i;
            }
        }
        return 0;
    }
}
