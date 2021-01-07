package sharma.hackerrank;

import java.math.BigInteger;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        System.out.println((int)(floor(sqrt(9))));
        System.out.println((int)ceil(sqrt(3)) + 1);

        System.out.println((int) (floor(sqrt(9))-ceil(sqrt(3))+1));
    }
//
//    static int squares(int a, int b) {
//        int count = 0;
//        for(int i = a; i<=b; i++){
//            if(Math.sqrt())
//        }
//
//    }

    public static long taumBday(int b, int w, int bc, int wc, int z){

        long tCost = 0;

        long bPrice = Math.min(bc, wc+z);
        long wPrice = Math.min(wc, bc+z);

                tCost += (long) b * bPrice + (long) w * wPrice;
        return tCost;

//        if (bc == wc){
//            tCost = (long)((b * bc) + (w * wc));
//        } else if (bc > (wc+z)) {
//            tCost = (long)(((b+w)*wc) + (b * wc));
//        } else if (wc > (bc+z)){
//            tCost = (long)(((b+w)*bc) + (w* bc));
//        }
//
//        return tCost;
    }

     static BigInteger fact(int n){
//        BigInteger integer = BigInteger.valueOf(n);
//
//        if (integer == (BigInteger)0) {
//            return (BigInteger) 1;
//        } else {
//            return integer * ((BigInteger) n - 1);
//        }
         BigInteger fact = BigInteger.valueOf(1);
         while (n>1){
             fact = fact.multiply(BigInteger.valueOf(n));
             n--;
         }

         return fact;

    }

}
