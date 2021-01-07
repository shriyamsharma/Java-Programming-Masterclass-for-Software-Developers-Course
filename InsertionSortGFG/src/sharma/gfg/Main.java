package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        int[] ar = {20,40,50,60,10,30};
        insertionSort(ar);

        for (int i = 0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }

    static void insertionSort(int arr[]){

        for (int i = 1; i <arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while ((j>=0)&&(arr[j]>key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

}
