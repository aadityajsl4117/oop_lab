package shape;
class Shape1 {
    public void display() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape1 {
    public void display() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape1 {
    public void display() {
        System.out.println("This is a rectangle");
    }
}

public class Shape {
    public static void main(String[] args) {

        Shape1 s = new Shape1();  
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        s.display();   
        c.display();
        r.display();
    }
}

