package com.company.device;

import com.company.Human;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Car extends Device{
    public Double millage;
    private Double value;
    public LinkedList<Human> carOwners = new LinkedList<>();
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.haveCar(this)) {
            throw new Exception("Brak samochodu!");
        }
        if (carOwners.getLast() != seller) {
            throw new Exception("Nie jesteś ostatnim właścicielem");
        }
        if (!buyer.haveFreeSpace()) {
            throw new Exception("A niby gdzie to będziesz trzymać?");
        }
        if (buyer.getCash() < price) {
            throw new Exception("A niby jak za to zapłacisz?");
        }

        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Sprzedano (temu złodziejowi somsiadowi)!");

        carOwners.add(buyer);
    }

    public void wasAnOwner(){
        if(carOwners.isEmpty()){
            System.out.println("Samochód nówka nie śmigany");
        }
    }
    public void doAsellB(Human seller, Human buyer){
        Iterator<Human> it = carOwners.iterator();
        while (it.hasNext()){
            if(it.next() == seller){
                if(it.hasNext() && it.next() == buyer){
                    System.out.println("Człowiek A sprzedał samochód człowiekowi B");
                    return;
                }
            }
        }
        System.out.println("Człowiek A nie sprzedał samochodu czlowiekowi B");
    }
    public void transactionNumbers(){
        System.out.println("Liczba transakcji: " + carOwners.size());
    }
}