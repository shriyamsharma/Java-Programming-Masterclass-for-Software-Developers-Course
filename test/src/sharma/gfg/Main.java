package sharma.gfg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 1;
        if(n%2!=0){
            for(int i = 2; i<n; i=i+2) {
                res = res * 2;
            }
        } else {
            for(int i = 3; i<n; i=i+2) {
                res = res * 3;
            }
        }
        System.out.println(res);
    }
}
