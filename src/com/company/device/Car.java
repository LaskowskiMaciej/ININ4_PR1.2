package com.company.device;

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
}