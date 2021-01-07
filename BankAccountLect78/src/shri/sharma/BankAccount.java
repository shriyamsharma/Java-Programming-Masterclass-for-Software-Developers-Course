package shri.sharma;

public class BankAccount {
    private String accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public BankAccount() {
        this("9302", 20.04, "shri", "xyz@mail.cd", "82392");
        System.out.println("empty constructor call");
    }

    public BankAccount(String accountNo, double balance, String customerName, String email, String phoneNo) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void depositfund(double depositfund) {
        this.balance += depositfund;
        System.out.println("Deposit of " + depositfund + " made. New balance is " + this.balance);
    }

    public void withdrawfund(double withdrawfund) {
        if (this.balance - withdrawfund < 0) {
            System.out.println("Only " + this.balance + " available. withdraw not processed");
        } else {
            this.balance -= withdrawfund;
            System.out.println("Withdraw of " + withdrawfund + " processed. Remaining balance = " + this.balance);
        }
    }
}
