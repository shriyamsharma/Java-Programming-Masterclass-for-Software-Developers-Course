package shri.sharma._static;

public class Main {

    public static int multiplier =7;

    public static void main(String[] args) {
//	    StaticTest firstInstances = new StaticTest("1st Instances");
//        System.out.println(firstInstances.getName() + " is instance number " + firstInstances.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instances");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instances");
//        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
//
//        StaticTest fourthInstance = new StaticTest("4th Instances");
//        System.out.println(fourthInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int ans = multiply(6);
        System.out.println("Answer is: "+ ans);
        System.out.println("Multipier is: " + multiplier);

    }

    public static int multiply(int number) {
        return  number * multiplier;
    }
}
