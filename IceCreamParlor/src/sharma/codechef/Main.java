package sharma.codechef;

//import java.util.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){

            int cost = scan.nextInt();
            int size = scan.nextInt();
            int[] prices =  new int[size];

            for(int j = 0; j < size; j++){
                prices[j] = scan.nextInt();
            }

            determineFlavors(prices,cost);

        }

    }

    public static void determineFlavors(int[] prices, int maxCost){

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(prices[0],1);

        for(int i = 1; i < prices.length; i++){

            Integer k = map.get(maxCost - prices[i]);

            if(k == null){
                map.put(prices[i], i+1);
            }else{
                System.out.println(k + " " + (i+1));
                break;
            }

        }

    }

//    public static void main(String[] args) {
//        int[] arr = {1,4,5,3,2};
////        int[] arr = {2,2,4,3};
//
//        int[] printArr = icecreamParlor(4, arr);
//        for (int i =0; i<printArr.length;i++){
//            System.out.print(printArr[i] + " ");
//        }
//    }
//
//    static int[] icecreamParlor(int m, int[] arr) {
//
//        int[] tempArr = new int[2];
//        Arrays.sort(arr);
//
//        for (int i = 0; i<arr.length; i++){
//            int temp = m - arr[i];
//            int low = i;
//            int high = arr.length-1;
//            int mid = (low + high)/2;
//            while (low <= high){
//                if (temp == arr[mid]){
//                    tempArr[0] = i+1;
//                    tempArr[1] = mid+1;
//                    break;
//                } else if (temp < arr[mid]){
//                    high = mid -1;
//                    if (temp == arr[high]) {
//                        tempArr[0] = i+1;
//                        tempArr[1] = high+1;
//                        break;
//                    }
//                } else {
//                    low = low +1;
//                    if (temp == arr[low]) {
//                        tempArr[0] = i+1;
//                        tempArr[1] = low+1;
//                        break;
//                    }
//                }
//            }
//        }
//
//        return tempArr;
//
//
//    }
}
