package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("speciesB");
        Phone iphone = new Phone("apple", "65", "iOS", 5.5);
        dog.name = "Szarik";

        System.out.println( "producer = "  + iphone.producer);
        System.out.println( "name = " + dog.name);

        System.out.println(dog.showPetWeight());
        dog.feed();
        System.out.println(dog.showPetWeight());

        do{
            dog.takeForAWalk();
            System.out.println(dog.showPetWeight());
        }while(dog.isAlive);

        Human me = new Human();
        me.mobilePhone = iphone;
        me.pet = dog;
        me.car = new Car("B4", "Volkswagen","Passat",1997,"black");

        /*
        typy proste nie są obiektami żadnej klasy
        int i;
        Integer ii = 5;
        long l;
        Long ll;
        //...
        boolean x;
        float f;
        double d;
        char c;
        short s;

        ii.doubleValue();
        */

    }
}
