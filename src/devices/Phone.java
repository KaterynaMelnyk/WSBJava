package devices;

public class Phone extends Device {

    final Double screenSize;
    final String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("You have turned on your phone!");
    }
}
