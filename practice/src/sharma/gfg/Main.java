package sharma.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {4,4,1,4};
    }

    public int lastStone(int[] stones) {
        Arrays.sort(stones);
        for(int i = stones.length; i > 0; i--) {
            for (int j = i-1; j>=0; j--) {
                if (stones[i] == stones[j]) {
                    i = i-2;
                    j = j-2;
                }
                stones[j] = stones[i] - stones[j];
            }
        }
        return 0;
    }

}
