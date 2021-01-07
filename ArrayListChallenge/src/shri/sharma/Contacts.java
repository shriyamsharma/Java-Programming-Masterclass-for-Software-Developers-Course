package shri.sharma;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.name = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContacts(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
