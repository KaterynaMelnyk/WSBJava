package com.company;

import java.io.File;

public class Animal implements salleable {
    final public String species;
    Double weight;
    String name;
    File pic;

    public Animal(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    void feed(){
        if (this.weight > 0) {
            System.out.println("Thx for food");
            this.weight += 1;
        }
        else{
            System.out.println("RIP");
        }
    }

    void takeForAWalk() {
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
