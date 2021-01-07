package sharma.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        int count = 0;
//
//        for(int i =0; i < n; i++){
//            arr[i] = scan.nextInt();
//            count++;
//            if(arr[i] == 42){
//                break;
//            }
//        }
//
//        for(int i = 0; i < count-1; i++){
//            System.out.println(arr[i]);
//        }
    }

    public static int BS(int[] arr, int n){

        int low = 0;
        int high = arr.length-1;

        while (low <=high) {
            int mid = (low + high)/2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
//        for (int i = low; i<=high; i++){
//            if (arr[i] == n){
//                return i;
//            }
//        }
//        return -1;
    }
}
