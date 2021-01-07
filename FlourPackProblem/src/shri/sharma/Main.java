package shri.sharma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(1, 0, 4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int newBigCount = bigCount * 5;
            int sum = newBigCount + smallCount;
            if (sum >= goal) {
                    if (goal % 5 > smallCount) {
                        return false;
                }
                    return true;
            } else {
                return false;
            }
        }
    }
}
