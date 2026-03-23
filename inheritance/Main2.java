class Vehicle {
    int speed = 60;

    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    int wheels = 4;

    void showCar() {
        System.out.println("Car wheels: " + wheels);
        System.out.println("Car speed: " + speed);
    }
}

class Truck extends Vehicle {
    int wheels = 6;

    void showTruck() {
        System.out.println("Truck wheels: " + wheels);
        System.out.println("Truck speed: " + speed);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();

        c.display();
        c.showCar();

        t.display();
        t.showTruck();
    }
}