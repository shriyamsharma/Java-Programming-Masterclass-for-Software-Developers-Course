package sharma.codechef;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int j =1; j<=T; j++){
            int n= s.nextInt();
            int k = s.nextInt();
            int tot = 0;
            int lrev = 0;
            for (int i = 0; i <n; i++){
                int[] arr = new int[n];
                arr[i] = s.nextInt();
                tot = tot + arr[i];
                if (arr[i] > k){
                    arr[i] = k;
                }
                lrev = lrev + arr[i];
            }
            System.out.println(tot - lrev);
        }
    }
}
