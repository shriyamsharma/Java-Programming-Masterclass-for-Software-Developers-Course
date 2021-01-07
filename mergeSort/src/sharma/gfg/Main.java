package sharma.gfg;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int[] arr = {1,3,4};

        int[] New = merge(arr,ar);

        for (int i =0 ; i<New.length; i++){
                System.out.print(New[i] + " ");
            }

    }

    public static int[] merge(int[] arr1, int[] arr2){
//        int tLen = arr1.length + arr2.length;
        int a = arr1.length;
        int b = arr2.length;
        int[] arr = new int[a+b];

        for (int i =0; i<arr1.length; i++){
            arr[i] = arr1[i];
        }
        for (int j =0; j<arr2.length; j++){
            arr[j+a] = arr2[j];
        }

        Arrays.sort(arr);
        return arr;
    }
}
