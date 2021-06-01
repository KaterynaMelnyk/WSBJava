package devices;

import com.company.salleable;
import creatures.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements salleable {

    public String color;
    public double cost;
    public List<String> owners;

    public Car(String model, String producer, String color, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.owners = new ArrayList<>();
    }

    public String toString() {
        return model + " " + producer + " " + color + " " + cost;
    }

    @Override
    public void turnOn() {
        System.out.println("You have turned on your car!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Car not found");
        }
        if (buyer.cash < price) {
            throw new Exception("You don't have enough money");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("You don't have enough space");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.addCar(this);
        seller.removeCar(this);
        System.out.println("Now your car has another owner!");
    }

    public abstract void refuel(double amount);

    public void addOwner(Human owner) {
        this.owners.add(owner.firstAndLastName());
    }

}
