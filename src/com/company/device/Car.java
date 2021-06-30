package com.company.device;

import com.company.Human;

public abstract class Car extends Device{
    public Double millage;
    private Double value;

    public Car(String producer, String model, Integer productionYear, Double millage, Double value) {
        super(producer, model, productionYear);
        this.millage = millage;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + productionYear +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Otwieram drzwi");
        System.out.println("Kluczyk w stacyjkę");
        System.out.println("Kręcę");
        System.out.println("Zapalił");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() == null){
            System.out.println("Brak samochodu");
        }
        else {
            System.out.println("Sprzedający posiada samochód.");
        }
        if(seller.getCash() < price){
            System.out.println("Nie stać Cię na samochód");
        }
        else {
            System.out.println("Gratuluję możesz robić brum brum.");
            seller.setCash(seller.getCash()-price);
            buyer.setCash(buyer.getCash()+price);
        }
    }

    public abstract void refuel();
}