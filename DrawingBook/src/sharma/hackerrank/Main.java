package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(pageCount(6,2));
    }

    public static int pageCount(int n, int p){

        int tot = n/2;
        int LtoR = p/2;
        int RtoL = tot - LtoR;

        return Math.min(LtoR, RtoL);
    }
}
