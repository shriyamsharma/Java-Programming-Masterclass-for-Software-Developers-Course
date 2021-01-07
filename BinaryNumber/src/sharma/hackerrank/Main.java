package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {

        int n = 15;
        int count = 0;
        int maxCount = 0;

        while (n > 0){
            int remainder = n % 2;
            if (remainder == 1){
                count++;
                if (count > maxCount){
                    maxCount = count;
                }
            } else {
                count =0;
            }
            n = n/2;
        }

        System.out.println(maxCount);


    }
}
