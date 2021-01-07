package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,2,1,3,4};

        int[] newArr = permutationEquation(arr);

        for (int i= 0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] permutationEquation(int[] p){
        int[] arr = new int[p.length];
        int n = p.length;
        int temp=0;

        for (int i = 0; i<p.length; i++){

            for (int j =0; j<p.length;j++){
                if (p[j] == i+1){
                    temp = j+1;
                    break;
                }
            }

            for (int j=  0; j<p.length; j++){
                if (p[j] == temp){
                    arr[j] = j+1;
                    break;
                }
            }
        }

        return arr;
    }
}
