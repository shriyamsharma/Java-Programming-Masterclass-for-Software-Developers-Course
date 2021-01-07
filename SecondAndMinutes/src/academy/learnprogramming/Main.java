package academy.learnprogramming;

import java.security.PublicKey;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 477));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(65, 9));
    }
    
    public static String getDurationString(long minutes, long seconds) {
        if ((minutes >= 0) && (seconds >=0 && seconds <=59)) {
           long hour = minutes / 60;
           long remainingHour = minutes % 60;

           String hoursString = hour + "h";
           if (hour < 10) {
               hoursString = "0" + hoursString;
           }

            String minutesString = remainingHour + "m";
            if (hour < 10) {
                minutesString = "0" + minutesString;
            }

            String secondString = seconds + "s";
            if (seconds < 10) {
                secondString = "0" + secondString;
            }

            return  hoursString + " " + minutesString + " " + secondString ;

        } else {
             return INVALID_VALUE_MESSAGE;
        }
    }
    
    public static String getDurationString(long seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long remainingsec = seconds % 60;

            String x = getDurationString(minutes, remainingsec);
            return x;
        } else  {
            return INVALID_VALUE_MESSAGE;
        }
    }
    
}
