package sharma.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Main {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthCheckOut = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public Main(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public Main(Map<String, Book> bookCollection, int lengthCheckOut, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthCheckOut = lengthCheckOut;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthCheckOut() {
        return lengthCheckOut;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }


    public void nextDay() {
        currentDay++;
    }

    public void setDay(int currentDay) {
        this.currentDay = currentDay;
    }

    // Instance Method

    public void checkOutBook(String title){
        Book book = getBook(title);
        if (book.getIsCheckOut()){
            sorryBookAlreadyCheckOut(book);
        } else {
            book.setCheckOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " + (getCurrentDay() + getLengthCheckOut()) + ".");
        }
    }


    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckout() + getLengthCheckOut());
        if (daysLate > 0){
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + " because you book is " + daysLate + " days over due.");
        } else {
            System.out.println("Book returned. Thanks!");
        }

        book.setCheckOut(false, -1);

    }

    public void sorryBookAlreadyCheckOut(Book book){
        System.out.println("Sorry " + book.getTitle() +  " is already checked out. It should  be back on day " +
                (book.getDayCheckout() + getLengthCheckOut()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 82828, 7876);
        bookCollection.put("Harry Potter", harry);

        Main<String>

    }
}
