package sharma.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(2);
        arr1.add(4);
        arr2.add(16);
        arr2.add(32);
        arr2.add(96);

        System.out.println(getTotalX(arr1, arr2));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b){
        int x = a.get(a.size()-1);
        int count = 0;
        int temp;

        while (x <= b.get(0)){
            temp = 0;
            for (int i = 0; i< a.size(); i++){
                if (x%a.get(i)!=0){
                    temp =1;
                    break;
                }
            }
            if (temp ==0){
                for (int i =0; i< b.size(); i++){
                    if (b.get(i) % x !=0){
                        temp =1;
                        break;
                    }
                }
            }
            if (temp ==0){
                count++;
            }
            x++;
        }
        return count;

    }

}
