package devices;

import com.company.salleable;
import creatures.Human;

public abstract class Car extends Device implements salleable {

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car != null && buyer.cash > price) {
            buyer.car = seller.car;
            seller.car = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Congratulations! Now your car has another owner!");
        } else {
            System.out.println("Sorry, there is something wrong with this operation...");
        }
    }

    public abstract void refuel(double amount);
}
