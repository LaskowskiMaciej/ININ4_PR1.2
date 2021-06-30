package com.company;

import com.company.creatures.Animal;
import com.company.device.Car;
import com.company.device.Phone;

import java.util.Date;

public class Human extends Animal {
    public static final String HUMAN_SPECIES = "homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 4;
    String firstName;
    String lastName;
    Integer age;
    public Animal pet;
    public Car[] garage;
    public Phone mobilePhone;
    private Double salary;
    private Double cash = 0.0;

    public Human(String firstName, String lastName, Integer age, Double salary) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
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

    public Car getCar(Integer parkNumber) {
        return new Car(this.garage[parkNumber].model,
                this.garage[parkNumber].producer,
                this.garage[parkNumber].productionYear,
                this.garage[parkNumber].millage,
                this.garage[parkNumber].getValue());
    }

    public void setCar(Car car, Integer parkNumber) {
        if (this.salary >= car.getValue()) {
            System.out.println("Możesz kupić samochód za gotówkę!");
            this.garage[parkNumber] = car;
        } else if (this.salary > car.getValue() / 12.0) {
            System.out.println("ZAKUP AUTA: nie aż takie gratulacje, kupiłeś na kredyt :/");
            this.garage[parkNumber] = car;
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

    public boolean haveCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (car == this.garage[i])
                return true;
        }
        return false;
    }

    public boolean haveFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (null == this.garage[i])
                return true;
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (car == this.garage[i]) {
                this.garage[i] = null;
            }
        }
    }
    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (null == this.garage[i]) {
                this.garage[i] = car;
                return;
            }
        }
    }
}
