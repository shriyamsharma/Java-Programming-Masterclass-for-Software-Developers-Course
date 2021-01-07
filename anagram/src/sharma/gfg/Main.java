package sharma.gfg;

//import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s1 = "rhiyar";
        String s2 = "rishyma";
        String s = "geeksforgeeks";

        System.out.println(notRepeat(s));

//        System.out.println(leftChar(s1));
//        System.out.println(anagram(s1,s2));
    }

    public static int notRepeat(String s){
        int res = Integer.MAX_VALUE;
        int n = 256;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        for (int i= 0; i<s.length(); i++){
            if (arr[s.charAt(i)] == -1){
                arr[s.charAt(i)] = i;
            } else {
                arr[s.charAt(i)] = -2;
            }
        }

        for (int i =0; i<n; i++){
            if (arr[i] >=0){
                res = Integer.min(res, arr[i]);
            }
        }

        if (res != Integer.MAX_VALUE) {
            return res;
        }
        return -1;

    }


//    public static int notRepeat(String s){
//
//            for (int i = 0; i< s.length(); i++){
//                for (int j = i+1; j<s.length()-1; j++){
//                    if (s.charAt(i) != s.charAt(j)){
//                        return i;
//                    }
//                }
//            }
//            return -1;
//
//    }














    public static int leftChar(String s){

//        return s.length();
//        char[] ar = s.toCharArray();
        boolean[] ar = new boolean[256];
        Arrays.fill(ar, false);

        int res = -1;

        for (int i = s.length()-1; i>= 0; i--){
            if (ar[s.charAt(i)] == false){
                ar[s.charAt(i)] = true;
            } else {
                res = i;
            }
        }

        return res;



        // O(n^2)

//        for (int i = 0; i< s.length(); i++){
//            for (int j = i+1; j < s.length(); j++){
//                if (s.charAt(i) == s.charAt(j)){
//                    return i;
//                }
//            }
//        }
//        return -1;

    }

//    public static boolean anagram(String s1, String s2){
//        int[] arr1 = new int[256];
//        int[] arr2 = new int[256];
//
//        if (s1.length() == s2.length()) {
//
//            for (int i = 0; i < s1.length(); i++) {
//
//                arr1[s1.charAt(i)]++;
//                arr2[s2.charAt(i)]++;
//
//            }
//            for (int i = 0; i < arr1.length; i++) {
//                if (arr1[i] != arr2[i]) {
//                    return false;
//                }
//            }
//            return true;
//
//        } else {
//            return false;
//        }
//
//    }

}
