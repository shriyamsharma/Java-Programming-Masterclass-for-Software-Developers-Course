package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

    }

    public static void shouldWakeUp(boolean barking, int hoursOfDay){
        if(hoursOfDay >= 0 && hoursOfDay <= 23) {
            if(hoursOfDay < 8 || hoursOfDay > 22) {
                if (barking == true) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
