package com.company.device;

public class Car {
    public final String model;
    public final String producer;
    public final int year;
    public Double millage;
    private Double value;

    public Car(String model, String producer, int year, Double millage, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
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
                ", year=" + year +
                '}';
    }

    /*@Override
    public void turnOn() {
        System.out.println("Otwieram drzwi");
        System.out.println("Kluczyk w stacyjkę");
        System.out.println("Kręcę");
        System.out.println("Zapalił");
    }*/
}