package shri.sharma;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count !=6) {
//            System.out.println(count);
//            count++;
//	    }
//        System.out.println("******************");
//	    count = 1;
//	    do {
//            System.out.println(count);
//            count++;
//        } while (count !=6);

        int num = 4;
        int finishnum = 20;
        int count = 0;
        while (num <= finishnum) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            System.out.println("even num is " + num);
            count++;
            if (count >= 5) {
                break;
            }

        }
    }

    public static boolean isEvenNumber(int num){
        if (num % 2 != 0) {
            return false;
        }
        return true;
    }
}
