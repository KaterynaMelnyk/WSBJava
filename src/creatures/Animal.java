package creatures;

import com.company.Human;
import com.company.salleable;

import java.io.File;

public abstract class Animal implements salleable, feedable {
    final public String species;
    Double weight;
    public String name;
    File pic;

    public Animal(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    @Override
    public void feed() {
        if (this.weight > 0) {
            System.out.println("Thx for food");
            this.weight += 1;
        } else {
            System.out.println("RIP");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            System.out.println("Let's go for  walk!");
            this.weight -= 1;
        } else {
            System.out.println("RIP");
        }
    }

    public String toString() {
        return species + " " + weight + " " + name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null && buyer.cash > price) {
            buyer.pet = seller.pet;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Congratulations! Now your pet has another owner!");
        } else {
            System.out.println("Sorry, there is something wrong with this operation...");
        }
    }
}
