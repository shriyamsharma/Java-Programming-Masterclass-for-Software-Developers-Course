package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sum(20));
    }

    public static int sum(int n){
        int sum = 0;

        for (int i = 1; i<= n; i++){
            if (n%i == 0){
                sum += i;
            }
        }

        return sum;
    }

}
