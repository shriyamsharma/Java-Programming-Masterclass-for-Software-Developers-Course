package com.example.test;
import com.shriyam.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("nsum of first 10 no is ");
	    for (int i =0; i<=10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("***************************************************");
        System.out.println("factorial of first 10 no is ");

        for (int i =0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("***************************************************");
        System.out.println("fibonacci of first 10 no is ");
        for (int i =0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
