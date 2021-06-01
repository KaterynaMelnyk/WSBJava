package devices;

public class Electric extends Car {
    public Electric(String model, String producer, String color, int yearOfProduction) {

        super(model, producer, color, yearOfProduction);
    }

    @Override
    public void refuel(double amount) {
        System.out.println("Refueled: " + amount);
    }
}
