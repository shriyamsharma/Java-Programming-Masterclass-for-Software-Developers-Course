package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";

        System.out.println(countingValleys(n, s));

    }

    public static int countingValleys(int n, String s){

        int alt = 0;
        int valleyCount = 0;

        for (int i =0; i< n; i++){

            char c = s.charAt(i);
            if (c == 'U'){
                alt++;
                if (alt == 0){
                    valleyCount++;
                }
            } else {
                alt--;
            }

        }

        return valleyCount;
    }

}
