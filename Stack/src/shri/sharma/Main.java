package shri.sharma;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i =0; i<10; i++) {
            stack.push(i);
        }

        for (int i=0; i<10; i++) {
            System.out.println("Deleted Value is :" + stack.pop());
        }

    }
}
