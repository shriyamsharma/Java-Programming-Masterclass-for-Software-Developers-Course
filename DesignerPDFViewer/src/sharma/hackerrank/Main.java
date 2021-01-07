package sharma.hackerrank;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String word = "zaba";
        int[] arr = {1,3,1,7};
        System.out.println(designerPdfViewer(arr,word));

    }

    static int designerPdfViewer(int[] h, String word) {

        int len = word.length();
        int ch = word.charAt(0);
        int max= h[ch-97];

        for (int i = 1; i<len; i++){
            int temp =h[word.charAt(i)-97];
            if (temp> max){
                max = temp;
            }
        }
        return max*len;

    }
}
