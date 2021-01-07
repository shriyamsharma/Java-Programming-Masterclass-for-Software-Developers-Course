package shri.sharma;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setAge(-1);
	person.setFirstName("");
	person.setLastName("");
        System.out.println(person.getAge());
        System.out.println(person.getFirstName());
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}
