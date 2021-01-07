package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {

        int[] apples = {-2, 2,1};
        int[] oranges = {5, -6};

        countApplesAndOranges(7, 11,5,15,apples,oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges){

        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i < apples.length; i++){
            int arr = 0;
            if (apples[i] > 0) {
                arr = a + apples[i];
                if ((arr >= s) && (arr <= t)){
                    appleCount++;
                }
            }
        }


        for (int i = 0; i < oranges.length; i++){
            int arr = 0;
            if (oranges[i] < 0) {
                arr = b + oranges[i];
                if ((arr >= s) && (arr <= t)){
                    orangeCount++;
                }
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
