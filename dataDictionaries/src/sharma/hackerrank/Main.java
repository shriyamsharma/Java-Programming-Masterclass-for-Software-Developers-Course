package sharma.hackerrank;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            Integer phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        System.out.println("Enter to search key");
        while(in.hasNext()){
            String s = in.next();

            if (phoneBook.containsKey(s)){
                int num = phoneBook.get(s);
                System.out.println(s + "=" + num);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
