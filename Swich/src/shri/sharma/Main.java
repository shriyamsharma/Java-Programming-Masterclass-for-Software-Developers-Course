package shri.sharma;

public class Main {

    public static void main(String[] args) {
	char SwitchValue = 'C  ';
	switch (SwitchValue) {
        case 'A':
            System.out.println("ans is A");
            break;
        case 'B':
            System.out.println("ans is B");
            break;
        case 'C' : case 'D' : case 'E':
            System.out.println("ans is C or D or E");
            break;
        default:
            System.out.println("ans is wrong");
    }
    }
}
