package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(3, 1);
        calcFeetAndInchesToCentimetres(156);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if ((feet >=0) && (inches >= 0 && inches <= 12)) {
            double centimeters = feet * 30.48;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm.");
            return centimeters;
        } else {
            System.out.println("Invalid Feet or inches");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimetres(double inches) {
        if(inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimetres(feet, remainingInches);
        } else  {
            return -1;
        }
    }
//    public static double calcFeetAndInchesToCentimetres(double inches) {
//        if(inches >= 0) {
//            double feet = inches/12;
//            return feet;
//        } else  {
//            return -1;
//        }
//    }

}
