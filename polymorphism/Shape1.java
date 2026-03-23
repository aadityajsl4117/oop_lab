class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Shape1{
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + s.area());
    }
}