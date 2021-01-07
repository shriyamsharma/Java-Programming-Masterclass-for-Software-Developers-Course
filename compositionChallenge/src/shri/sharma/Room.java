package shri.sharma;

public class Room {
    private Furniture furniture;
    private String curtains;
    private Television television;
    private Fan fan;


    public Room(Furniture furniture, String curtains, Television television, Fan fan) {
        this.furniture = furniture;
        this.curtains = curtains;
        this.television = television;
        this.fan = fan;
    }

    public Fan getFan() {
        return fan;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public String getCurtains() {
        return curtains;
    }

    public Television getTelevision() {
        return television;
    }
}
