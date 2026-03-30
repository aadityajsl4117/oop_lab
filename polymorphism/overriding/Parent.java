class Parent1 {
    void add(int a, int b) {
        System.out.println("Parent Add: " + (a + b));
    }
}

class Child extends Parent1 {
    @Override
    void add(int a, int b) {
        System.out.println("Child Add: " + (a + b + 10));
    }
}

public class Parent {
    public static void main(String[] args) {
        Parent1 obj = new Child();
        obj.add(5, 3);
    }
}
