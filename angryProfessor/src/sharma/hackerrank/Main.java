package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int[] a = {-1,-3,4,2};
        System.out.println(angryProfessor(3, a));
    }

    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int i = 0; i< a.length;i++){
            if (a[i] <= 0){
                count++;
            }
        }

        if (count >= k){
            return "NO";
        } else {
            return "YES";
        }
    }
}
