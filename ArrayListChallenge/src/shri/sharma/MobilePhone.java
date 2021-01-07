package shri.sharma;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(Contacts.getName()) >= 0) {
            System.out.println("Contact is already exists");
            return false;
        }

        myContacts.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
            return -1;
        }
    }
}
