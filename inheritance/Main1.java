class Shape {
    double pi = 3.14;
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double result = pi * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

public class Main1{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
    }
}