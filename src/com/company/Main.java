package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Animal("Canis familiaris", 18.0);
        //dog.species = "Canis familiaris";
        //dog.weight = 18.0;
        dog.name = "Szarik";

        Animal cat = new Animal("Felis catus", 2.0);
        //cat.species = "Felis catus";
        //cat.weight = 2.0;
        cat.name = "Murzik";
        Animal pig = new Animal("Pig", 3.3);

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.feed();

        Human me = new Human();
        me.firstName = "Kateryna";
        me.lastName = "Melnyk";
        me.pet = cat;

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        Car samochod = new Car("X5", "BMW", "czarny");
        me.car = samochod;

        me.setSalary(7700.0);
        double sal = me.getSalary();
    }
}
