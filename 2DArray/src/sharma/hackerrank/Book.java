package sharma.hackerrank;

public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckOut;
    int dayCheckout = -1;

    public Book(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckOut = false;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean getIsCheckOut() {
        return isCheckOut;
    }

    public int getDayCheckout() {
        return dayCheckout;
    }

    public void setCheckOut(boolean checkOut, int currentDayCheckOut) {
        isCheckOut = checkOut;
        setDayCheckout(currentDayCheckOut);
    }

    private void setDayCheckout(int day){
        this.dayCheckout = day;
    }

}
