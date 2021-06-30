package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Date;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "homo sapiens";
    String firstName;
    String lastName;
    Integer age;
    Animal pet;
    private Car car;
    Phone mobilePhone;
    private Double salary;
    private Double cash = 0.0;

    public Human(String firstName, String lastName, Integer age, Double salary) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println("Pobrana wartość wynagrodzenia: " + this.salary);
        System.out.println("Termin pobrania informacji: " + new Date());
        return this.salary;
    }

    public void setSalary(Double salary) {

        if (salary < 0.0) {
            System.out.println("Wal się, nie będę za darmo tego robił.");
        } else {
            System.out.println("dane wysłane do księgowego");
            System.out.println("koniecznie odbierz aneks od pani Hani z kadr");
            System.out.println("ZUS i US już o wszystkim wiedzdą");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return new Car(this.car.model,
                this.car.producer,
                this.car.productionYear,
                this.car.millage,
                this.car.getValue());
    }

    public void setCar(Car car) {
        if (this.salary >= car.getValue()) {
            System.out.println("Możesz kupić samochód za gotówkę!");
            this.car = car;
        } else if (this.salary > car.getValue() / 12.0) {
            System.out.println("ZAKUP AUTA: nie aż takie gratulacje, kupiłeś na kredyt :/");
            this.car = car;
        } else {
            System.out.println("ZAKUP AUTA: porażka, zmień pracę");
        }
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + "l";
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        throw new RuntimeException("Zakaz handlu ludźmi");
    }
}
