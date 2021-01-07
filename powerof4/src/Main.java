public class Main {
    public static void main(String[] args) {
        int n  = 16;

    }

    public static boolean powof4(int n) {
        while(n>0) {
            if(n%4 != 0) {
                return false;
                break;
            }
            n = n/4;
        }

        return true;

    }
}
