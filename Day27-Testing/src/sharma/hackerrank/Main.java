package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 4};
        System.out.println(get_expected_result(arr));
    }

    public static int get_expected_result(int[] arr) {
//        int[] newArr = get_array();
        int  min = Integer.MAX_VALUE;
        int minRes = 0;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                minRes = i;
            }
        }

        return minRes;

    }
}
