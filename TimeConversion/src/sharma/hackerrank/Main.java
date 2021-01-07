package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s){
        String[] str = s.split(":");
        int hour  = Integer.parseInt(str[0]);

        String min  = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() -2, secPeriod.length());

        String newTimeInString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeInString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeInString = (12 + hour) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))){
            newTimeInString = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))){
            newTimeInString = hour + ":" + min + ":" + sec;
        }
        return newTimeInString;
    }
}
