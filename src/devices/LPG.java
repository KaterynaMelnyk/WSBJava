package devices;

public class LPG extends Car {
    public LPG(String model, String producer, String color) {
        super(model, producer, color);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
