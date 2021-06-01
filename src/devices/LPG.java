package devices;

public class LPG extends Car {
    public LPG(String model, String producer, String color, int yearOfProduction) {

        super(model, producer, color, yearOfProduction);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
