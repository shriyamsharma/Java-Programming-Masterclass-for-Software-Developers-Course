package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] num = {1,2,4};
        int[] num1 = {1,3};

            System.out.println(maxArea(5,4,num, num1));


    }

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int max = h*w;
        for (int i =0; i<horizontalCuts.length; i++){
            int m = max - w;
            max = Math.abs(m);
        }
        for (int j = 0; j<verticalCuts.length;j++){
            max = max - h;
        }

        return max;
    }


//    public static int maxProduct(int[] nums) {
//        int max = 0;
//
//
//        if (nums.length == 2){
//            max = (nums[0] -1) * (nums[1]-1);
//        }
//
//        for(int i =0; i < nums.length; i++){
//            for (int j=1;j <nums.length-1; j++){
//
//                if (i!=j){
//                    int num =0;
//                    num = (nums[i]-1) * (nums[j]-1);
//                    if (num > max){
//                        max = num;
//                    }
//                }
//            }
//        }
//        return max;
//    }
}
