abstract class Car {
    String model;
    double baseRate;

    Car(String model, double baseRate) {
        this.model = model;
        this.baseRate = baseRate;
    }
    abstract double calculateFare(int km);

    void display() {
        System.out.println("Car Model: " + model);
    }
}

class ElectricCar extends Car {

    ElectricCar(String model, double baseRate) {
        super(model, baseRate);
    }

    @Override
    double calculateFare(int km) {
        return baseRate * km * 0.8; 
    }
}

class DieselCar extends Car {

    DieselCar(String model, double baseRate) {
        super(model, baseRate);
    }

    @Override
    double calculateFare(int km) {
        return baseRate * km + 50;
    }
}

public class Car1 {
    public static void main(String[] args) {

        Car c1 = new ElectricCar("Tesla", 10);
        Car c2 = new DieselCar("Scorpio", 8);

        int distance = 20;

        c1.display();
        System.out.println("Fare: " + c1.calculateFare(distance));

    c2.display();
    System.out.println("Fare: " + c2.calculateFare(distance));
}