package shri.sharma;

public class Main {

    public static void main(String[] args) {
	    //calculate amount of10000 with rate of 2,3,4,5,6,7,8
//        for(int i=2; i<9; i++) {
//           System.out.println("10,000 at " + i + "% interest = " +  String.format("%.2f", calculateInterest(10000, i)));
//        }

        //calculate amount of10000 with rate of 8 to 2 %
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " +  String.format("%.2f", calculateInterest(10000, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/ 100));
    }
}
