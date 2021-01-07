package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
//        System.out.println(reverse(451));
    }



    public static int beautifulDays(int i, int j, int k){

        int count =0;
        for (int a = i; a<=j; a++){
            int digit = Math.abs(a - reverse(a));
            if (digit%k == 0){
                count++;
            }
        }

        return count;
    }

    public static int reverse(int no){
        int reverse = 0;

        while (no != 0){
            int digit = no % 10;
            reverse = reverse * 10 + digit;
            no /=10;
        }

        return reverse;
    }
}
