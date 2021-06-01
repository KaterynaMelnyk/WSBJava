package devices;

public abstract class Device {
    public String model;
    public String producer;
    public int yearOfProduction;

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    public abstract void turnOn();
}
