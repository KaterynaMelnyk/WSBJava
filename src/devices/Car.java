package devices;

public class Car {
    public String model;
    public String producer;
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
}
