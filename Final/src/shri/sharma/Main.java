package shri.sharma;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
////        Math m = new Math();
//
//        int pass = 674312;
//        Password password = new ExtendedPassword(pass);
//        password.storePassword();
//
//        password.letMeIn(4738);
//        password.letMeIn(pass);
//        password.letMeIn(48982294);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
