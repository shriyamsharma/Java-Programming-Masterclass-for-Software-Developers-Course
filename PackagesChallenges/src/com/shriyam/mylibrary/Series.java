package com.shriyam.mylibrary;

public class Series {

    public static long nSum(int n) {
        long sum = 0;

        if (n== 0) {
            return 0;
        } else if ( n  == 1) {
            return 1;
        } else {
            for (int i=0; i<=n;i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            fact = n * factorial(n-1);
            return fact;
        }
    }

    public static long fibonacci(int n) {
        long fibo = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            fibo = fibonacci(n-1) + fibonacci(n-2);
            return fibo;
        }
    }


    public static void main(String[] args) {
        System.out.println(nSum(1));

        System.out.println(factorial(5));

        System.out.println(fibonacci(9));
    }

}
