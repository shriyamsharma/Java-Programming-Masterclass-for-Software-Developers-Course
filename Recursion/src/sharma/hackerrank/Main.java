package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxCuts(23,11,9,12));
    }

    static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n-1) + n;
    }

    static int pow(int a, int b){
        System.out.println(b);
        if (b==0){
            return 1;
        }
        return pow(a, b-1) * a;
    }

    static int fastPow(int a, int b){
        System.out.println(b);
        if (b==0){
            return 1;
        }
        if (b%2==0){
            return fastPow(a*a, b/2);
        }
        return a * fastPow(a, b-1);
    }

    static int path(int n, int m){
        if (n ==1||m==1){
            return 1;
        }
        return path(n-1, m) + path(n, m-1);
    }

//    static int func(int n){
//        if (n<1){
//            return 0;
//        } else {
//            System.out.println(n);
//            func(n-1);
//            System.out.println(n);
//        }
//    }

    public static boolean isPalindrome(String str, int s, int e){
        if (s==e)
            return true;
        if (s>e)
            return true;
        if (str.charAt(s) != str.charAt(e))
            return false;

        return isPalindrome(str, s+1, e-1);
    }

    public static int maxCuts(int n, int a, int b, int c){
        if (n==0)
            return 0;
        if (n<0)
            return -1;
        int res = Math.max((Math.max(maxCuts(n-a,a,b,c), maxCuts(n-b,a,b,c))), maxCuts(n-c,a,b,c));
        if (res == -1)
            return -1;

        return (res+1);
    }
}
