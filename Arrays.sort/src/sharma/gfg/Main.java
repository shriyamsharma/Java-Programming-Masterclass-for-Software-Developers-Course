package sharma.gfg;

import java.util.Arrays;

public class Point {
    int x, y;

    Point(int a, int b){
        x =a;
        y= b;
    }
}

class MySort implements Comparable<Point> {

    public int compare(Point a, Point b) {
        return (a.x - b.x);
    }

}


public class Main {

    public static void main(String[] args) {

        int[] arr = {new Point(10,20), new Point(3,12), new Point(5,7)};

        Arrays.sort(arr, new MySort());

        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }

    }
}
