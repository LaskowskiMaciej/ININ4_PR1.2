package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile{

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Ho mniom mniom, ale dobra szyneczka :D");
    }
}
