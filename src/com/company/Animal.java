package com.company;

import java.io.File;

public class Animal {
    final String species;
    public String name = "petname";
    private Double weight;
    File pic;
    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    Boolean isAlive = true;


    Animal(String species){
        this.species = species;
        defaultWeight(species);
    }

    void defaultWeight(String species){
        switch (species) {
            case "speciesA" -> this.weight = 5.0;
            case "speciesB" -> this.weight = 10.0;
            case "speciesC" -> this.weight = 15.0;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed(){
        if(isAlive) {
            this.weight++;
            System.out.println("thx for food");
        }
        else
            System.out.println("The pet is dead ;(");
    }
    void takeForAWalk(){
        if(isAlive) {
            this.weight--;
            if (this.weight <= 0) {
                isAlive = false;
                System.out.println("R.I.P " + this.name);
            } else
                System.out.println("thx for a walk");
        }
        else
            System.out.println("The pet is dead ;(");
    }
    Double showPetWeight(){
        return this.weight;
    }
}
