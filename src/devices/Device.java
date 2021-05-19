package devices;

public abstract class Device {
    public String model;
    public String producer;
    public String yearOfProduction;

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    public abstract void turnOn();
}
