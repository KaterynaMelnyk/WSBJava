package devices;

public class Electric extends Car {
    public Electric(String model, String producer, String color) {
        super(model, producer, color);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
