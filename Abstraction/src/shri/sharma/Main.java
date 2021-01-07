package shri.sharma;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("roCKY");
	    dog.breathe();
	    dog.eat();

//	    Bird bird = new Bird("Parrot");
//	    bird.eat();
//	    bird.breathe();
    	Parrot parrot = new Parrot("Red Parrot");
    	parrot.fly();
    	parrot.breathe();
    	parrot.eat();

		System.out.println("____________________________________________________________________________");

		Penguin penguin = new Penguin("White Penguin");
		penguin.fly();
		penguin.eat();
		penguin.breathe();

		System.out.println("____________________________________________________________________________");


    }
}
