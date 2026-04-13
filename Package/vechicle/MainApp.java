package vechicle;

// Interface
interface Vehicle {
    void start();
    void stop();
}

// Car class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

// Bike class
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}

// Main class
public class MainApp {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        System.out.println("Car:");
        c.start();
        c.stop();

        System.out.println("\nBike:");
        b.start();
        b.stop();
    }
}
