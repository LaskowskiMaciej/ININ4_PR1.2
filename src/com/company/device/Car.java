package com.company.device;

import com.company.Human;

public class Car extends Device{
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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.haveCar(this)) {
            throw new Exception("Brak samochodu!");
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
    }


}