package shri.sharma;

public class Vehicle {
    private String name;
    private String size;

    private int currentDirection;
    private int speed;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.speed = 0;
    }


    public void Hand_steering(int direction) {
        this.currentDirection += direction;
        System.out.println("vehicle steering at " + currentDirection + " degree.");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(int velocity, int direction) {
        speed = velocity;
        currentDirection = direction;
        System.out.println("vehicle moving at " + speed + " in direction " + currentDirection);
    }

    public void stop() {
        this.speed = 0;
    }
}
