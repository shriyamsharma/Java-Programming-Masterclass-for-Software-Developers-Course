package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(-4));

        System.out.println("*****************************************");

        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 5) {
                    System.out.println("Here is the first " + count + " digit of prime");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
//        for (int i=2; i <= n/2; i++) {
//            if(n % i == 0) {
//                return false;
//            }
//        }
        for (int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
