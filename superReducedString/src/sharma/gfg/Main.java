package sharma.gfg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next();
        StringBuffer str = new StringBuffer(st);

        for (int i = 1; i<str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                str.delete(i-1, i+1);
                i=0;
            }
        }

        if (str.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(str);
    }

//    public static String superReducedString(String s){
//
//        StringBuffer str = new StringBuffer(s);
//
//        for (int i = 1; i<s.length(); i++){
//            if (s.charAt(i) == s.charAt(i-1)){
//                str.delete(i-1, i+1);
//                i=0;
//            }
//        }
//        if (str.length() == 0)
//            return "Empty String";
//        else
//            s = str.toString();
//
//        return s;
//
//    }
}
