package shri.sharma;

public class Main {

    public static void main(String[] args) {
    	SimpleCalculator calculator = new SimpleCalculator();
	    calculator.setFirstNumber(4);
	    calculator.setSecondNumber(0);
        System.out.println("Sum = " + calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
    }
}
