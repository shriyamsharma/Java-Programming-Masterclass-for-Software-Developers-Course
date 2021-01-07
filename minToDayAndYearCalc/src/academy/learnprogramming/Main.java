package academy.learnprogramming;


public class Main {

    private static final String INVALID_TEXT = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = (int) minutes / 525600;
            long day =  (int) (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
