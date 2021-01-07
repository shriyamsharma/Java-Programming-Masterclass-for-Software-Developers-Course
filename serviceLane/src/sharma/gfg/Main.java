package sharma.gfg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        int start=0, end =0;
        for (int j=0; j<t;j++){
            start = scan.nextInt();
            end = scan.nextInt();
            int min = Integer.MAX_VALUE;
            for (int i = start; i<=end;i++){
                min = Integer.min(arr[i], min);
            }
            System.out.println(min);
        }


    }
}
