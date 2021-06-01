package devices;

public class Disel extends Car {
    public Disel(String model, String producer, String color, int yearOfProduction) {

        super(model, producer, color, yearOfProduction);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
