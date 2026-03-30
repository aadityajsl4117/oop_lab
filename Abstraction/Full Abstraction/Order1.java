interface Order {

    void placeOrder();
    void cancelOrder();
}

class AmazonOrder implements Order {

    public void placeOrder() {
        System.out.println("Order placed on Amazon");
    }

    public void cancelOrder() {
        System.out.println("Order cancelled on Amazon");
    }
}

class FlipkartOrder implements Order {

    public void placeOrder() {
        System.out.println("Order placed on Flipkart");
    }

    public void cancelOrder() {
        System.out.println("Order cancelled on Flipkart");
    }
}

public class Order1{
    public static void main(String[] args) {
        Order o = new FlipkartOrder();
        o.placeOrder();
        o.cancelOrder();
    }
}
