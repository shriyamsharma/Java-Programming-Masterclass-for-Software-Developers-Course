package shri.sharma;

public class Printer {
    private int tonerLevel;
    private int noOfPages;
    private boolean isDuplex;


    public Printer(int tonerLevel, boolean isDuplex) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.noOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public void duplexPrinter() {
        if (isDuplex) {
            System.out.println("Printer is Duplex");
        } else {
            System.out.println("printer is not Duplex");
        }
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printer in duplex mode");
        }
        this.noOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
