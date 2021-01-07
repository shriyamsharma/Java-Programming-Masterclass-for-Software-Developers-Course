package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] newArr = breakingRecords(arr);

        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }

    public static int[] breakingRecords(int[] arr) {
        int countHigh = 0;
        int countLow = 0;
        int low = arr[0];
        int high = arr[0];
        int[] newArr = new int[2];

        for (int i = 0; i < arr.length; i++){

            if (high < arr[i]){
                countHigh++;
                high = arr[i];
            }
            if (low > arr[i]){
                countLow++;
                low = arr[i];
            }
        }

        newArr[0] = countHigh;
        newArr[1] = countLow;

        return newArr;
    }
}
