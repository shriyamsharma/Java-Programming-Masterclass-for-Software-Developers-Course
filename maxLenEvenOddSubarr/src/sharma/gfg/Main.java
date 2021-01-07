package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,10,20,6,3,8};
        int res = 0;
        for(int i = 0; i<arr.length; i++) {
            int max = 1;
            for(int j = i+1; j<arr.length; j++) {
                if ((arr[j]%2==0 && arr[j-1] %2 ==0) || (arr[j]%2!=0 && arr[j-1] %2 !=0)) {
                    break;
                } else {
                    max++;
                }
            }
            res = Math.max(res, max);
        }
        System.out.println(res);
    }
}
