package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,10,2,9};
        bonAppetit(arr, 1,12);
    }

    public static void bonAppetit(int[] bill, int k, int b){
        int sum = 0;
        int bact = 0;

        for (int i =0; i< bill.length; i++){
            if (i == k){
                continue;
            } else {
                sum = sum + bill[i];
            }
        }
        bact = sum/2;
        if (b == bact){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-bact);
        }
    }
}
