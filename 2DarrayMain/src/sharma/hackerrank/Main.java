package sharma.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        catsAndMouse(1,3,2);
    }

    public static void catsAndMouse(int x, int y, int z){

        int xDist = Math.abs(x - z);
        int yDist = Math.abs(y - z);
            if (xDist < yDist) {
                System.out.println("Cat A");
            }
            if (xDist > yDist){
                System.out.println("Cat B");
            }
            if (xDist == yDist){
                System.out.println("Mouse C");
            }



//        if ((x<z) && (y< z)){
//
//            int xDist = z - x;
//            int yDist = z - y;
//            if (xDist < yDist) {
//                System.out.println("Cat A");
//            }
//            if (xDist > yDist){
//                System.out.println("Cat B");
//            }
//            if (xDist == yDist){
//                System.out.println("Mouse C");
//            }
//        }
//
//        if ((x>z) && (y< z)) {
//            int xDist = x - z;
//            int yDist = z - y;
//
//            if (xDist < yDist) {
//                System.out.println("Cat A");
//            }
//            if (xDist > yDist){
//                System.out.println("Cat B");
//            }
//            if (xDist == yDist){
//                System.out.println("Mouse C");
//            }
//        }
//        if ((x<z) && (y> z)){
//            int xDist = z - x;
//            int yDist = y - z;
//
//            if (xDist < yDist) {
//                System.out.println("Cat A");
//            }
//            if (xDist > yDist){
//                System.out.println("Cat B");
//            }
//            if (xDist == yDist){
//                System.out.println("Mouse C");
//            }
//        }

    }

}
