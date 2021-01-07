package shri.sharma;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int encryptedPassword) {
        super(encryptedPassword);
        this.decryptedPassword = encryptedPassword;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
