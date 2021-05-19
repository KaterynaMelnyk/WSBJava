package devices;

import com.company.Human;
import com.company.salleable;

public class Phone extends Device implements salleable {

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != null && buyer.cash > price) {
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Congratulations! Now your phone has another owner!");
        } else {
            System.out.println("Sorry, there is something wrong with this operation...");
        }
    }
}
