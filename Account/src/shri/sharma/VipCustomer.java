package shri.sharma;

public class VipCustomer {
    private String name;
    private int credit_limit;
    private String emailAddress;

    public VipCustomer() {
        this("shrisharma", 50000, "shri@hsk.cjd");
        System.out.println("default customer");
    }

    public VipCustomer(String name,int credit_limit) {
        this(name, credit_limit, "");
    }

    public VipCustomer(String name, int credit_limit, String emailAddress){
        this.name = name;
        this.credit_limit = credit_limit;
        this.emailAddress = emailAddress;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCredit_limit (int credit_limit) {
//        this.credit_limit = credit_limit;
//    }
//
//    public void  setEmailAddress(String emailAddress){
//        this.emailAddress = emailAddress;
//    }

    public String getName(){
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
