package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal dog = new Animal("Canis familiaris", 18.0);
        dog.name = "Szarik";

        Animal cat = new Animal("Felis catus", 2.0);
        cat.name = "Murzik";

        Animal pig = new Animal("Pig", 3.3);

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.feed();

        Human me = new Human();
        me.firstName = "Kateryna";
        me.lastName = "Melnyk";
        me.pet = cat;

        //zadanie 1
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        //zadanie 3 i 4
        me.setSalary(7700.0);
        double sal = me.getSalary();

        //zadanie 2/5
        Car samochod = new Car("X5", "BMW", "czarny");
        samochod.cost = 3300.0;
        me.setCar(samochod);
        Car myCar = me.getCar();
        System.out.println(myCar.model);

        //zadanie6
        Car samochod2 = new Car("X5", "BMW", "czarny");
        samochod2.cost = 3300.0;
        System.out.println(samochod == samochod2);
        System.out.println(samochod2);
        System.out.println(samochod);

        System.out.println(cat);

        System.out.println(me);

        Phone iphone = new Phone("Apple", "10", 5.8, "IOS");
        me.mobilePhone = iphone;
        System.out.println(iphone);

        //zadanie7
        iphone.turnOn();
        samochod.turnOn();
    }

}
