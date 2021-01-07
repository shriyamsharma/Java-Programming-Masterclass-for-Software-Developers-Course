package shri.sharma;

public class Main {

    public static void main(String[] args) {
	   int[] intArray = new int[10];
//	   intArray[0] = 50;
//	   intArray[1] = 55;
//	   double doubleArray = new double[10];
//     System.out.println(intArray[0]);
//	   System.out.println(intArray[1]);

		for (int i = 0; i<intArray.length; i++) {
			intArray[i] = (i+1) * 10;
		}

		printArray(intArray);
//		for (int i = 0 ; i < 10; i++) {
//			System.out.println(intArray[i]);
//		}

    }

    public static void printArray(int[] array) {
		for (int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
