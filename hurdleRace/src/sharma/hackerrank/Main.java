package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 6, 3, 5, 2};
        int k = 4;

        System.out.println(hurdleRace(k, arr));

    }

    public static int hurdleRace(int k, int[] arr){
        int doses;
        int max = 0;

        for (int i =0; i< arr.length; i++){
            if (k < arr[i]){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
        }

        if (max == 0){
            doses = max;
        } else {
            doses = max - k;
        }

        return doses;

    }
}
