package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }

    public static int utopianTree(int n){

        int height = 0;

        for (int i = 0; i <= n; i++){
            if (i == 0){
                height++;
            } else if (i % 2 != 0){
                height = height * 2;
            } else {
                height++;
            }
        }

        return height;

    }
}
