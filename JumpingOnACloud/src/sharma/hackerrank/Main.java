package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0, 1, 1, 0};
        int[] arr1 = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(arr1, 3));
    }

    public static int  jumpingOnClouds(int[] c, int k){


        int e = 100;
        int n = c.length;
        int i=0;
        do{
            e--;
            i=(i+k)%n;
            if(c[i]==1)e-=2;
        }while(i!=0);

        return e;

    }
}
