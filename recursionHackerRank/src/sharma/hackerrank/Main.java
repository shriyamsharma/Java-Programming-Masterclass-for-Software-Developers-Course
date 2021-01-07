package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursion(3));
    }

    public static int recursion(int n){
        if (n <= 1){
            return 1;
        } else {
            return n * recursion(n-1);
        }
    }
}
