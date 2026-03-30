abstract class Payment {

    abstract void pay(int amount);

    void receipt() {
        System.out.println("Payment successful, receipt generated");
    }
}

class UPI extends Payment {

    void pay(int amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class CreditCard extends Payment {

    void pay(int amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

public class Payment1{
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
        p.receipt();
    }
}