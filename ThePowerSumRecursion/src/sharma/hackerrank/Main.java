package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(powerSum(10,2,1));
        System.out.println(powerSum(100,2,1));
        System.out.println(powerSum(100,3,1));

    }

    public static int powerSum(int x, int n, int num){
        int var = (int)Math.pow(num,n);
        if (var < x)
            return powerSum(x, n, num+1) + powerSum(x-var, n, num+1);

        if (x == var)
            return 1;
        else
            return 0;
    }
}
