package com.company;

import java.io.File;

public class Animal implements Salleable{
    final String species;
    public String name = "petname";
    private Double weight;
    File pic;
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0D;
    Boolean isAlive = true;

    Animal(String species) {
        this.species = species;
        this.defaultWeight(species);
    }

    void defaultWeight(String species) {
        byte var3 = -1;
        switch(species.hashCode()) {
            case -2132875643:
                if (species.equals("speciesA")) {
                    var3 = 0;
                }
                break;
            case -2132875642:
                if (species.equals("speciesB")) {
                    var3 = 1;
                }
                break;
            case -2132875641:
                if (species.equals("speciesC")) {
                    var3 = 2;
                }
        }

        switch(var3) {
            case 0:
                this.weight = 5.0D;
                break;
            case 1:
                this.weight = 10.0D;
                break;
            case 2:
                this.weight = 15.0D;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    void feed() {
        if (this.isAlive) {
            Double var1 = this.weight;
            this.weight = this.weight + 1.0D;
            System.out.println("thx for food");
        } else {
            System.out.println("The pet is dead ;(");
        }

    }

    void takeForAWalk() {
        if (this.isAlive) {
            Double var1 = this.weight;
            this.weight = this.weight - 1.0D;
            if (this.weight <= 0.0D) {
                this.isAlive = false;
                System.out.println("R.I.P " + this.name);
            } else {
                System.out.println("thx for a walk");
            }
        } else {
            System.out.println("The pet is dead ;(");
        }

    }

    Double showPetWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " " + this.species + " " + this.weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet == null){
            System.out.println("Nie ma dogo");
        }
        else {
            System.out.println("Sprzedający posiada dogo.");
            if(seller.getCash() < price){
                System.out.println("Nie stać Cię na psa");
            }
            else {
                System.out.println("Zwierze sprzedającego: " + seller.pet);
                System.out.println("Zwierze kupującego: " + buyer.pet);
                System.out.println("Stan konta sprzedającego przed tranzakcją: " + seller.getCash());
                System.out.println("Stan konta kupującego przed tranzakcją: " + buyer.getCash());
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                System.out.println("Stan konta sprzedającego po tranzakcji: " + seller.getCash());
                System.out.println("Stan konta kupująćego po transakcji: " + buyer.getCash());
                Animal dogo = new Animal(seller.pet.species);
                dogo.name = seller.pet.name;
                dogo.isAlive = seller.pet.isAlive;
                buyer.pet = dogo;
                seller.pet = null;
                System.out.println("Gratuluję nowej pociechy.");
                System.out.println("Zwierze sprzedającego: " + seller.pet);
                System.out.println("Zwierze kupującego: " + buyer.pet);

            }
        }

    }
}
