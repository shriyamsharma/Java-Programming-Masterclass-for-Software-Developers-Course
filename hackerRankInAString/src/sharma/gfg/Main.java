package sharma.gfg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        for (int a =0; a<n; a++){
            String s = scan.next();
            String hack = "hackerrank";
            int count = 0;
            for (int i = 0;i<hack.length()-1; i++){
                for (int j =0; j<s.length(); j++){
                    if (hack.charAt(i) == s.charAt(j)){
                        i++;
                        count++;
                    }
                }
            }
            if (count == hack.length()){
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
