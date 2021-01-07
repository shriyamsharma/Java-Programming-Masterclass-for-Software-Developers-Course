import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2019 - yearOfBirth;
            scanner.nextLine(); // to handle next line character
            System.out.println("Enter your fav game: ");
            String game = scanner.nextLine();
            if (age >= 0 && age <= 100) {
                System.out.println("Name is " + name + ", and you are " + age + " years old." + game);
            } else {
                System.out.println("Invalid Age");
            }
        } else {
            System.out.println("Unable to Parse Value");
        }
        scanner.close();
    }
}
