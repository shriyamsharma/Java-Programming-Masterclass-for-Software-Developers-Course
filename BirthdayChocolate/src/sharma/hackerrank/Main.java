package sharma.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
//        s.add(4);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 3;
        int m = 2;

        System.out.println(birthdayChocolate(s, d, m));

    }

    public static int birthdayChocolate(List<Integer> s, int d, int m){

        int count = 0;
        for (int i = 0; i <= s.size() - m; i++){
            int add =0;
            for (int j = i; j <i + m; j++){
                add+= s.get(j);
            }
            if (add == d){
                count++;
            }
        }
        return count;

    }
}
