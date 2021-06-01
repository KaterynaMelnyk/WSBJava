package com.company;

import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.Electric;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Pet dog = new Pet("Canis familiaris", 18.0);
        dog.name = "Szarik";

        Pet cat = new Pet("Felis catus", 2.0);
        cat.name = "Murzik";

        FarmAnimal pig = new FarmAnimal("Pig", 3.3);

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
        Car samochod = new Electric("X5", "BMW", "czarny");
        samochod.cost = 3300.0;
        me.setCar(samochod);
        Car myCar = me.getCar();
        System.out.println(myCar.model);

        //zadanie6
        Car samochod2 = new Electric("X5", "BMW", "czarny");
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

        //zadanie8
        Human anotherHuman = new Human();
        anotherHuman.cash = 8000.0;

        cat.sell(me, anotherHuman, 700.0);
        System.out.println(me.cash);
        System.out.println(anotherHuman.pet);
        System.out.println((me.pet));

        samochod.sell(me, anotherHuman, 900.0);
        System.out.println(me.getCar());
        System.out.println(anotherHuman.getCar());

        iphone.sell(me, anotherHuman, 700.0);
        System.out.println(me.mobilePhone);
        System.out.println(anotherHuman.mobilePhone);


        //zadanie10
        Disel dis = new Disel("R5", "Opel", "white");
        dis.refuel(100);
    }

}
