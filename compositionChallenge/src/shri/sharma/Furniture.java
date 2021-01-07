package shri.sharma;

public class Furniture {
    private String chair;
    private String bed;
    private String sofa;

    public Furniture(String chair, String bed, String sofa) {
        this.chair = chair;
        this.bed = bed;
        this.sofa = sofa;
    }

    public String getChair() {
        return chair;
    }

    public String getBed() {
        return bed;
    }

    public String getSofa() {
        return sofa;
    }
}
