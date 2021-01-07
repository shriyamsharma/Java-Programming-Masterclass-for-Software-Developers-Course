package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2));
    }

    public static int saveThePrisoner(int n, int m, int s) {

        int r = m%n;
        if ((r+s-1) % n ==0){
            return n;
        } else {
            return ((r+s-1) % n);
        }

    }
}
