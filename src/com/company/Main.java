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


        me.setSalary(7700.0);
        double sal = me.getSalary();
        Car samochod = new Car("X5", "BMW", "czarny");
        samochod.cost = 3300.0;
        me.setCar(samochod);
        Car myCar = me.getCar();
        System.out.println(myCar.model);

    }

}
