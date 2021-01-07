package shri.sharma;

public class Main {

    public static void main(String[] args) {
	    Account shriAccount = new Account("shriyam Sharma");

	    shriAccount.deposit(1000);
	    shriAccount.withdraw(500);
	    shriAccount.withdraw(-200);
	    shriAccount.deposit(-20);
	    shriAccount.calculateBalance();
//	    shriAccount.balance = 5000;

        System.out.println("Balance on shriyam's account is: " + shriAccount.getBalance());
    }
}
