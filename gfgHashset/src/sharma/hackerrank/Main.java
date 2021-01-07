package sharma.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String s = "hello";
        String s1 = "zxvczbtxyzvy";
        String s2 = "xxyyzz";

        System.out.println(nonRepeatingCharacter(s));
        System.out.println(nonRepeatingCharacter(s1));
//        System.out.println(nonRepeatingCharacter(s2));
//        nonRepeatingCharacter(s);
//        nonRepeatingCharacter(s1);
//        nonRepeatingCharacter(s2);

    }

    public static int differCount(int[] arr) {
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i< arr.length; i++){
            h.add(arr[i]);
        }

        return h.size();
    }

    public static void freqCount(int[] arr){
//        HashMap<Integer, Integer> h = new HashMap<>();

        LinkedHashMap<Integer, Integer> h = new LinkedHashMap<>();

        for (int i = 0; i <arr.length; i++){
//            int count =1;
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) +1);
            } else {
                h.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static int countNonRepeated(int[] arr){
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;

        for (int i = 0; i <arr.length; i++){
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) +1);
            } else {
                h.put(arr[i], 1);
            }
        }


        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
            if (e.getValue() == 1){
                count++;
            }
        }


        return count;
    }


    public static char nonRepeatingCharacter(String s){
        LinkedHashMap<Character, Integer>  h = new LinkedHashMap<>();

        for(int i = 0; i < s.length(); i++){
            if (h.containsKey(s.charAt(i))) {
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            } else {
                h.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> e : h.entrySet()){

            if (e.getValue() == 1) {
                return  e.getKey();
                break;
            }

        }

        throw new RuntimeException("$");

    }
}
