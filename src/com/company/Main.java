package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.device.Car;
import com.company.device.CarComparator;
import com.company.device.Phone;

import java.util.Arrays;

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
        me.setCash(200000.0);

        Application nerflix = new Application("Nerflix", 21.37, 29.99);
        Application bankApp = new Application("Bank BGC", 31.02, 0.0);
        Application faceSwap = new Application("FaceSwap", 1.3, 8.99);
        Application chatter = new Application("Chatter", 9.01, 0.0);

        me.mobilePhone.appInstall(me, nerflix);
        me.mobilePhone.appInstall(me, bankApp);
        //me.mobilePhone.appInstall(me, faceSwap);
        me.mobilePhone.appInstall(me, chatter);

        me.mobilePhone.isApplicationInstalled(nerflix);
        me.mobilePhone.isApplicationInstalled(bankApp);
        me.mobilePhone.isApplicationInstalled(faceSwap);
        me.mobilePhone.isApplicationInstalled(chatter);

        me.mobilePhone.isApplicationInstalledByName("Nerflix");
        me.mobilePhone.isApplicationInstalledByName("Bank BGC");
        me.mobilePhone.isApplicationInstalledByName("FaceSwap");
        me.mobilePhone.isApplicationInstalledByName("Chatter");

        me.mobilePhone.allFreeAplications();

        me.mobilePhone.nameSort();
        me.mobilePhone.priceSort();

        /*
        Car passat = new Car("B1", "Volkswagen", 1997, 300000.0, 10000.0);
        Car passat2 = new Car("B2", "Volkswagen", 1998, 300000.0, 10000.0);
        Car passat3 = new Car("B3", "Volkswagen", 1999, 300000.0, 10000.0);
        Car passat4 = new Car("B4", "Volkswagen", 2000, 300000.0, 10000.0);

        passat4.wasAnOwner();

        passat.transactionNumbers();
        me.setCar(passat, 0);
        me.setCar(passat2, 1);
        me.setCar(passat3, 2);
        me.setCar(passat4, 3);

        System.out.println(Arrays.deepToString(me.garage));

        Arrays.sort(me.garage, new CarComparator());

        System.out.println(Arrays.deepToString(me.garage));
        Car carToSell = me.getCar(0);
        carToSell.transactionNumbers();
        carToSell.doAsellB(me, buyer);
        try {
            carToSell.sell(me, buyer, 15000.0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        carToSell.transactionNumbers();
        carToSell.doAsellB(me, buyer);



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