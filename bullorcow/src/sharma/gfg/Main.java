package sharma.gfg;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    String secret = "55291";
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i= 0;i<secret.length(); i++) {
            h.put((int)secret.charAt(i)-(int)'0', h.getOrDefault((int)secret.charAt(i)-(int)'0', 0)+1);
        }
        for(Map.Entry m : h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
