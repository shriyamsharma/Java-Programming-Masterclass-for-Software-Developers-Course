package shri.sharma;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car - accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Bmw extends Car {
    public Bmw(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Jaguar extends Car {
    public Jaguar(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Jaguar -> STARTENIGINE()";
    }

    @Override
    public String accelerate() {
        return "Jaguar -> acceleraTE()";
    }

    @Override
    public String brake() {
        return "Jaguar -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Bmw bmw = new Bmw(6, "I-Vision");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
    }
}
