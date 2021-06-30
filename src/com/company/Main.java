package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("speciesB");
        Phone iphone = new Phone("apple", "65", "iOS", 5.5);
        dog.name = "Szarik";

        System.out.println( "producer = "  + iphone.producer);
        System.out.println( "name = " + dog.name);

//        System.out.println(dog.showPetWeight());
//        dog.feed();
//        System.out.println(dog.showPetWeight());
//
//        do{
//            dog.takeForAWalk();
//            System.out.println(dog.showPetWeight());
//        }while(dog.isAlive);

        Human me = new Human("Maciej", "Laskowski",5415.3);
        me.mobilePhone = iphone;
        me.pet = dog;

        Car passat = new Car("B4", "Volkswagen",1997,300000.0, 10000.0);
        me.setCar(passat);

        System.out.println(me.getSalary());
        me.setSalary(-12.0);
        me.setSalary(0.0);
        System.out.println(me.getSalary());
        me.setSalary(10000.0);
        System.out.println(me.getSalary());
        iphone.setScreenSize(2.0);

        System.out.println("licznik: "+me.getCar().millage);

        Car myPassat = me.getCar();
        myPassat.millage = 150000.0;

        System.out.println("licznik: "+myPassat.millage);


    }
}