package com.company;

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

}
