package shri.sharma;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
            for (i = 2; i<=)
            System.out.println(n % i !=0);
        }
        return true;
    }
}
