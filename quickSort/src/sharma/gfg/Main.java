package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        int[] arr = {8,4,7,9,3,10,5};

        qSort(arr, 0, 6);

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static int part(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for (int j = l; j<h;j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    private static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

//    public static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    public static void qSort(int[] arr, int l, int h){
        if (l<h){
            int p = part(arr,l,h);
            qSort(arr,l, p-1);
            qSort(arr,p+1,h);
        }
    }

}
