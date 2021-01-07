package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2,4,6,8,3};
	    int n = arr.length;

        insertionSort1(n, arr);
    }



    public static void insertionSort1(int n, int[] arr){

        int last = arr[n-1];
        for (int i = n-2; i >= 0; i--){
            if (last >= arr[i]){
                arr[i+1] = last;
                printArray(arr);
                break;
            }
            arr[i+1] = arr[i];
            printArray(arr);
        }
        if (last < arr[0]){
            arr[0] = last;
        }
}

    private static  void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}




//    public static void insertionSort1(int n, int[] arr){
//        int last = arr[n-1];
//
//        for (int i = n-2; i >= 0; i--){
//            int temp
//            if (arr[i] > last){
//                temp = arr[i];
//                arr[i+1] = temp;
//            } else {
//                arr[i+1] = last;
//            }
//            for (int j = 0; j < arr.length; j++){
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println();
//        }
//    }