package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.device.Car;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("speciesB");
        Phone iphone = new Phone("apple", "65", "iOS", 5.5, 2019);
        dog.name = "Szarik";

        FarmAnimal pig = new FarmAnimal("speciesC");

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human("Maciej", "Laskowski", 18, 5415.3);
        me.mobilePhone = iphone;
        me.pet = dog;
        me.setCash(200.0);

        pig.feed(20.0);
        pig.beEaten();

        /*
        Human buyer = new Human("Zdzisław", "Nowakowski", 30, 2800.0);
        buyer.setCash(200.0);

        Car passat = new Car("B4", "Volkswagen", 1997, 300000.0, 10000.0);
        Car passat2 = new Car("B4", "Volkswagen", 1997, 300000.0, 10000.0);
        me.setCar(passat);

        System.out.println("licznik: " + me.getCar().millage);

        Car myPassat = me.getCar();
        //myPassat.millage = 150000.0;

        System.out.println("licznik: " + me.getCar().millage);

        System.out.println("If ==");
        if (passat == passat2) {
            System.out.println("Samochody są takie same.");
        } else {
            System.out.println("Samochody różnią się od siebie.");
        }

        System.out.println("Eqals:");

        if (passat.equals(passat2)) {
            System.out.println("Samochody są takie same.");
        } else {
            System.out.println("Samochody różnią się od siebie.");
        }

        System.out.println("Człowiek: " + me);
        System.out.println("Dogo: " + dog);
        System.out.println("Telefon: " + iphone);
        System.out.println("Samochód: " + passat);
        System.out.println("Samochód: " + myPassat);
        System.out.println("Samochód: " + passat2);

        passat.turnOn();
        System.out.println();
        iphone.turnOn();

        me.pet.sell(me, buyer, 100.0);
        buyer.sell(buyer, me, 2.50);

        */
    }
}