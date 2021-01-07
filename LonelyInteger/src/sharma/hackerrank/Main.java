package sharma.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 1};

        System.out.println(lonelyInteger(arr));
    }

    public static int lonelyInteger(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int key = getKey(map, 1);

        return key;

    }

    public static <K, V> K getKey(Map<K, V> map, V val){
        for (K key: map.keySet()){
            if (val.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

}
