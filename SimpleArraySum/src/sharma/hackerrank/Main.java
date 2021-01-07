package sharma.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("Love");
        list.add("JJava");
        list.add("Lag");
        Iterator<Object> iter = list.iterator();
        while ((iter.hasNext())){
            System.out.println(iter.next().toString() + " ");
        }
        System.out.println();

    }


}
