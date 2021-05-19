package devices;

public class Car extends Device {

    public String color;
    public double cost;

    public Car(String model, String producer, String color) {
        this.model = model;
        this.producer = producer;
        this.color = color;
    }

    public String toString() {
        return model + " " + producer + " " + color + " " + cost;
    }

    @Override
    public void turnOn() {
        System.out.println("You have turned on your car!");
    }
}
