package shri.sharma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    private static ArrayList<Integer> input = new ArrayList<>();
//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter the data in 0 or 1");
//        while (scanner.hasNextInt()) {
//            input.add(scanner.nextInt());
//            scanner.nextLine();
//        }
//        System.out.println("Entered value is ");
//        for (Integer i: input) {
//            System.out.print(i);
//        }
//
//        int inputSize = input.size();
//
//        for(int i=0; i<= inputSize; i++){
//
//        }
//
//    }


        System.out.print("Enter the data in 0 or 1: ");
        Scanner sn=new Scanner(System.in);
        String data = sn.nextLine();
        String res = new String();
        String out=new String();
        int counter = 0;
        for(int i=0;i<data.length();i++)
        {    if (data.charAt(i)!='1' && data.charAt(i)!='0')
        {
            System.out.println("Enter only Binary values!!!");
            return;
        }
            if(data.charAt(i) == '1')
            {
                counter++;
                res = res + data.charAt(i);
            }
            else
            {
                res = res + data.charAt(i);
                counter = 0;
            }
            if(counter == 5)
            {
                res = res + '0';
                counter = 0;
            }
        }
        String inc="01111110"+res+"01111110";
        System.out.println("The Message to be transfered: " +inc);
        System.out.println("Sending Message....");
        counter=0;
        for(int i=0;i<res.length();i++)
        {

            if(res.charAt(i) == '1')
            {

                counter++;
                out = out + res.charAt(i);

            }
            else
            {
                out = out + res.charAt(i);
                counter = 0;
            }
            if(counter == 5)
            {
                if((i+2)!=res.length())
                    out = out + res.charAt(i+2);
                else
                    out=out + '1';
                i=i+2;
                counter = 1;
            }
        }

        System.out.println("Message Received...Successfully!!!");
        System.out.println("The Destuffed Message is: "+out);
    }
}
