package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    int minValue = Integer.MIN_VALUE;
//        System.out.println(minValue);

        byte testByte = 122;
        System.out.println(testByte);

        short testSrt = 32752;
        System.out.println(testSrt);

        int  testInt = 1283048291;
        System.out.println(testInt);

        long testLong = 50000L + 10L * (testByte + testInt + testSrt);
        System.out.println(testLong);
    }
}
