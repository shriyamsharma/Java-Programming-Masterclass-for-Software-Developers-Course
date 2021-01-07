package shri.sharma;

public class PC {
    private Motherboard motherboard;
    private Case thecase;
    private Moniter moniter;

    public PC(Motherboard motherboard, Case thecase, Moniter moniter) {
        this.motherboard = motherboard;
        this.thecase = thecase;
        this.moniter = moniter;
    }


    public void poweUp() {
        thecase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        moniter.drawPixelAt(1200, 50, "yellow");
    }

//    public Moniter getMoniter() {
//        return moniter;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Case getThecase() {
//        return thecase;
//    }
}
