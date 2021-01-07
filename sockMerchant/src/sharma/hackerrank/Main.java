package sharma.hackerrank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 9;
        int ar[] = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(n, ar));

    }

    public static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for (int i = 0; i< n-1; i++){
            if (i<n && ar[i] == ar[i+1]){
                count = count + 1;
                i++;
            }
        }
        return count;
    }

}
