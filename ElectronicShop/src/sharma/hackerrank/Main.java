package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {

        int[] k = {3,1};
        int[] d = {5,2,8};

        System.out.println(getMoneySpent(k, d, 10));

    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b){

        int max = -1;

            for (int i = 0; i<keyboards.length; i++){
                for (int j =0; j< drives.length; j++){
                    int sum = keyboards[i] + drives[j];
                    if ((sum <= b) && (sum > max)){
                        max = sum;
                    }
                }
            }

            return max;

    }
}
