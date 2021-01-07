public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result;
        if (barking) {
            if((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <=23)) {
                result = true;
            } else {
                result = false;
            }
        }  else {
            result = false;
        }
        return result;
    }
}
