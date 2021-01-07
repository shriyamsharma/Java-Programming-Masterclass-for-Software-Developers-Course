package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        int n = 16;
        System.out.println(powof4(n));
    }

    public static boolean powof4(int n) {
        if(n==0) {
            return false;
        }
        while(n!=1) {
            if(n%4 != 0) {
                return false;
            }
            n = n/4;
        }

        return true;
    }
}
