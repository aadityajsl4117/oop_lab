class Car1 {
    String model;
    double baseRate;

    Car1(String model, double baseRate) {
        this.model = model;
        this.baseRate = baseRate;
    }
    double calculateFare(int km) {
        return baseRate * km; 
    }

    void display() {
        System.out.println("Car Model: " + model);
    }
}

class ElectricCar extends Car1 {

    ElectricCar(String model, double baseRate) {
        super(model, baseRate);
    }

    @Override
    double calculateFare(int km) {
        return baseRate * km * 0.8; 
    }
}

class DieselCar extends Car1 {

    DieselCar(String model, double baseRate) {
        super(model, baseRate);
    }

    @Override
    double calculateFare(int km) {
        return baseRate * km + 50;
    }
}

public class Car{
    public static void main(String[] args) {

        Car1 c1= new ElectricCar("Tesla", 10);
        Car1 c2 = new DieselCar("Scorpio", 8);
        Car1 c3 = new Car1("BasicCar", 5); 

        int distance = 20;

        c1.display();
        System.out.println("Fare: " + c1.calculateFare(distance));

        c2.display();
        System.out.println("Fare: " + c2.calculateFare(distance));

        c3.display();
        System.out.println("Fare: " + c3.calculateFare(distance));
    }
}