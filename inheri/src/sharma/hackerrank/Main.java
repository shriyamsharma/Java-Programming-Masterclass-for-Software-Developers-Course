package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {100, 80};
        System.out.println(calculate(arr));
    }

    public static char calculate(int[] arr){
        int add = 0;
        int avg;

        for (int i =0; i< arr.length;i ++){
            add += arr[i];
        }

        avg =  add/arr.length;

        if (avg < 40){
            return 'T';
        } else if (avg < 55){
            return 'D';
        } else if (avg <70){
            return 'P';
        } else if (avg < 80){
            return 'A';
        } else if (avg < 90){
            return 'E';
        } else {
            return 'O';
        }
    }
}
