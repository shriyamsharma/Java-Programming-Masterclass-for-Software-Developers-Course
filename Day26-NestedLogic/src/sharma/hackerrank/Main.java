package sharma.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dAct = scan.nextInt();
        int mAct = scan.nextInt();
        int yAct =  scan.nextInt();

        int dExp = scan.nextInt();
        int mExp = scan.nextInt();
        int yExp =  scan.nextInt();

        scan.close();

        verifyFine(dAct, mAct, yAct, dExp, mExp, yExp);
    }

    public static void verifyFine(int dAct,int  mAct, int yAct, int dExp, int mExp, int yExp){

        if (yAct > yExp){
            System.out.println("10000");
        } else if (mAct > mExp && yAct == yExp){
            System.out.println(500 * (mAct - mExp));
        } else if (dAct > dExp && mAct == mExp && yAct == yExp){
            System.out.println(15 * (dAct - dExp));
        } else {
            System.out.println("0");
        }
    }
}
