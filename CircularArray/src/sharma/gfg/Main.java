package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,4,5};
        int[] q = {1,2};
        int k =2;
        int[] newArr = circularArrayRotation(arr, k, q);

        for (int i = 0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }

    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k = k % a.length-1;
        reverse(a, 0,a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k,a.length-1);

        int[] arr = new int[queries.length];
        for (int i = 0; i<arr.length; i++){
            arr[i] = a[queries[i]];
        }

        return arr;
    }

    static void reverse(int[] a, int start, int  end){
        while (start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end++;
        }
    }


}
