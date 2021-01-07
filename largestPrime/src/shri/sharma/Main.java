package shri.sharma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getLargestPrime(30);
    }
    public static void getLargestPrime(int number) {
        if (number < 2) {
            System.out.println("invlaid");
        }else {
            int largestprime = 0;
            for (int i = 2; i < number; i++) {
              if (number % i == 0) {
                  System.out.println(i);
                  largestprime = i;
                  number = number / i;
                  i--;
              }
                System.out.println(largestprime);
            }
        }
    }
}
