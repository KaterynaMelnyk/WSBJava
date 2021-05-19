package devices;

public class Phone {
    final String producer;
    final String model;
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
}
