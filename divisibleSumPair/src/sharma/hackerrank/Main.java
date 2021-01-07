package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 1, 2};
        int k = 3;
        System.out.println(divisibleSumPair(arr, k));
    }

    public static int divisibleSumPair(int[] arr, int k){
        int count = 0;

        for (int i =0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (i != j && (arr[i] + arr[j])%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
