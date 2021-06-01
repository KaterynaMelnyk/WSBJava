package devices;

public class Disel extends Car {
    public Disel(String model, String producer, String color) {
        super(model, producer, color);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
