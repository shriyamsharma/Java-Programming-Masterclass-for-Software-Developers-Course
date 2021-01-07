package sharma.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i< len; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();

        for (int i =0; i< arr.length; i++){
            boolean prime  = isPrime(arr[i]);
            if (prime == false){
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }
    }

    public static boolean isPrime(int val){
        if (val <= 1){
            return false;
        }
        if (val == 2){
            return true;
        }
        if (val % 2 == 0){
            return false;
        }
        for (int i= 3; i < Math.sqrt(val) +1; i += 2){
            if (val % i == 0){
                return false;
            }
        }
        return true;
    }

}
