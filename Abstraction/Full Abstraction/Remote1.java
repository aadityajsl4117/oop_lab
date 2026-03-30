interface Remote {

    void turnOn();
    void turnOff();
}

class TV implements Remote {

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

public class Remote1 {
    public static void main(String[] args) {
        Remote r = new TV();
        r.turnOn();
        r.turnOff();
    }
}
