package sharma.hackerrank;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i< n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(arr);

        System.out.println(arr.length);
        for (int i =1; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
                System.out.println(arr.length - i);
            }
        }
    }
}
