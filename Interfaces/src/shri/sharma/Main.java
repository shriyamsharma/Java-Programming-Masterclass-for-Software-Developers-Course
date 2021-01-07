package shri.sharma;

public class Main {

    public static void main(String[] args) {
        ITelephone shriPhone;
        shriPhone = new DeskPhone(1234);
        shriPhone.powerOn();
        shriPhone.callPhone(1234);
        shriPhone.answer();

        shriPhone = new MobilePhone(26718);
        shriPhone.powerOn();
        shriPhone.callPhone(26718);
        shriPhone.answer();
    }
}
