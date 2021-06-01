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

        Human me = new Human("Kateryna", "Melnyk", 5);
        me.pet = cat;

        //zadanie 1
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        //zadanie 3 i 4
        me.setSalary(7700.0);
        double sal = me.getSalary();

        //zadanie 2/5
        Car samochod = new Electric("X5", "BMW", "czarny", 1993);
        samochod.cost = 3300.0;
        me.setCar(samochod, 1);
        Car myCar = me.getCar(1);
        System.out.println(myCar.model);

        //zadanie6
        Car samochod2 = new Electric("X5", "BMW", "czarny", 2005);
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
        Human anotherHuman = new Human("Bob", "Marley");
        anotherHuman.cash = 8000.0;

        cat.sell(me, anotherHuman, 700.0);
        System.out.println(me.cash);
        System.out.println(anotherHuman.pet);
        System.out.println((me.pet));

        samochod.sell(me, anotherHuman, 900.0);
        System.out.println(me.getCar(1));
        System.out.println(anotherHuman.getCar(1));

        iphone.sell(me, anotherHuman, 700.0);
        System.out.println(me.mobilePhone);
        System.out.println(anotherHuman.mobilePhone);


        //zadanie10
        Disel dis = new Disel("R5", "Opel", "white", 2008);
        dis.refuel(100);

        //zadanie 11
        me.addCar(samochod2);
        Electric samochod3 = new Electric("P9", "Honda", "pink", 2020);
        me.addCar(samochod3);
        me.printCarsfromGarage();

        //zadanie 12
        System.out.println(me.getCar(1).owners);
        System.out.println(samochod.owners);
    }


}
