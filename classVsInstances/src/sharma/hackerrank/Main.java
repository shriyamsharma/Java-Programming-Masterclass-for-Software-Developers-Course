package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++){
            for (int j= 0; j <arr.length; j++) {
                arr[i][j] = arr[i][j];
            }
        }
        for (int i =0; i < arr.length; i++){
            for (int j =0; j<arr.length; j++){
                System.out.println(arr[i][j]);
            }
        }
//        System.out.println(diagonalDifference(arr));
    }
//
//    public static int diagonalDifference(int[] arr){
//        int
//    }
}
