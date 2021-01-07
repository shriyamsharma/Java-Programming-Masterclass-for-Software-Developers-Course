package sharma.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lis1 = Arrays.asList( 14, 12, 31);
        List<Integer> lis2 = Arrays.asList( 142, 12, 21);

        System.out.println(compareTheTriplet(lis1, lis2));

    }

    public static List<Integer> compareTheTriplet(List<Integer> a, List<Integer> b){

        int countA = 0;
        int countB = 0;
        int size = a.size();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < size; i++){
            if (a.get(i) > b.get(i)){
                countA++;
            }
            if (a.get(i) < b.get(i)){
                countB++;
            }
        }
        list.add(countA);
        list.add(countB);

        return list;


    }
}
