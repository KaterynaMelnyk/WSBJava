package com.company;

import java.io.File;

public class Animal {
    final public String species;
    Double weight;
    String name;
    File pic;

    public Animal(String species, double weight){
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
    void takeForAWalk(){
        if (this.weight > 0) {
            System.out.println("Let's go for  walk!");
            this.weight -= 1;
        }
        else{
            System.out.println("RIP");
        }
    }

}
