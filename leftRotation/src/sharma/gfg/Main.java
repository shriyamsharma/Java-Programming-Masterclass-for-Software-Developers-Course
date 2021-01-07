package sharma.gfg;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<ArrayList>
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[(i+n-d)%n] = scan.nextInt();
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }


    }

//    public static void leftRotation(int[] arr, int d) {
//        int len = arr.length;
//        d= d%arr.length;
//        reverse(arr, 0, len-1);
//        reverse(arr, 0, d-1);
//        reverse(arr, d, len-1);
//
//        int[] array
//    }
//
//    public static void reverse(int[] arr, int s, int e) {
//        while (s > e) {
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
//    }


}
