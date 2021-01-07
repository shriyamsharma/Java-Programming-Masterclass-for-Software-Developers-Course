package sharma.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);

        System.out.println(pickingNumber(list));
    }

    public static int pickingNumber(List<Integer> a){
        Collections.sort(a);
        int highest = 0;
        for (int i =0; i< a.size(); i++){
            int count = 0;
            for (int j =0; j<=i; j++){
                if ((Math.abs(a.get(i) - a.get(j))) <=1){
                    count++;
                }
                if (count > highest){
                    highest = count;
                }
            }
        }
        return highest;
    }


}
