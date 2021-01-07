package shri.sharma;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new  Dimensions(20, 28, 32);
        Case thecase = new  Case("5A2H", "dell", "240", dimensions);
        Moniter moniter = new Moniter("4HWJ", "ASUS", 32, new Resolution(32, 45));
        Motherboard motherboard = new Motherboard("HSD78", "BITCH", 6, 5, "v2/2.3");
        PC pc = new PC(motherboard, thecase, moniter);

        pc.poweUp();

//        pc.getMoniter().drawPixelAt(3, 4,"red");
//        System.out.println(pc.getMotherboard().getCardSlots());
    }
}
