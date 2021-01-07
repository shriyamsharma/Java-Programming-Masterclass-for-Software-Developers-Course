package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(libraryFine(9,6,2015,6,6,2015));
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(y1 > y2) {
            fine = 10000;
        }
        else if(y1 == y2) {
            if(m1 > m2) {
                fine = 500 * (m1 - m2);
            }
            else if(m1 == m2) {
                if(d1 > d2) {
                    fine = 15 * (d1 - d2);
                }
            }
        }
        return fine;
    }
}
