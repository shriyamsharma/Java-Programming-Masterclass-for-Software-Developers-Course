package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int n = 10;
        int MainAdd = 0;

        for(int i = 0; i<=n; i++){
            int add = a + ((int)Math.pow(2, i) * b);
            MainAdd += add;
            System.out.print(MainAdd + " ");
        }
    }

}
