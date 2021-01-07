package sharma.hackerrank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,4,2,6,1,7,8,9,2,1};
        System.out.println(candies(arr));
    }

    public static long candies(int[] arr){
        int[] a = new int[arr.length];
        long sum = 0;

        Arrays.fill(a, 1);

        for (int i= 1; i< arr.length; i++){
            if (arr[i] > arr[i-1]){
                a[i] = a[i-1] + 1;
            }
        }

        for (int i= arr.length-2; i>=0 ; i--){
            if (arr[i] > arr[i+1]){
                a[i] = Math.max(a[i], a[i+1] +1);
            }
        }

        for (int i = 0; i<a.length; i++){
            sum = sum + (long)a[i];
        }

        return sum;

    }

}
