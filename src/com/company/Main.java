package com.company;

import com.company.device.Car;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("speciesB");
        Phone iphone = new Phone("apple", "65", "iOS", 5.5, 2019);
        dog.name = "Szarik";

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human("Maciej", "Laskowski", 18, 5415.3);
        me.mobilePhone = iphone;
        me.pet = dog;

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
    }
}