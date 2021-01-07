package shri.sharma;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50, false);
        System.out.println("Initial page count" + printer.getNoOfPages());

        int pagePrinted = printer.printPages(4);
        System.out.println("Pages printed is" + pagePrinted + " new total print count for printer = " + printer.getNoOfPages());
        pagePrinted = printer.printPages(2);
        System.out.println("Pages printed is" + pagePrinted + " new total print count for printer = " + printer.getNoOfPages());
    }
}
