package com.company;

import java.util.Date;

public class Human extends Animal{
    private static final String HUMAN_SPECIES = "homo sapiens";
    String firstName;
    String lastName;

    Animal pet;
    private Car car;
    Phone mobilePhone;
    private Double salary;

    public Human(Double salary) {
        super(HUMAN_SPECIES);
        this.salary = salary;
    }

    public Double getSalary() {
        System.out.println("Pobrana wartość wynagrodzenia: " + this.salary);
        System.out.println("Termin pobrania informacji: " + new Date());
        return this.salary;
    }

    public void setSalary(Double salary){

        if (salary < 0.0){
            System.out.println("Wal się, nie będę za darmo tego robił.");
        }
        else{
            System.out.println("dane wysłane do księgowego");
            System.out.println("koniecznie odbierz aneks od pani Hani z kadr");
            System.out.println("ZUS i US już o wszystkim wiedzdą");
        }
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        if(this.salary>= this.car.getValue()){
            System.out.println("Możesz kupić samochód za gotówkę!");
        }
        else if(this.salary> car.getValue()/12.0){
            System.out.println("ZAKUP AUTA: nie aż takie gratulacje, kupiłeś na kredyt :/");
        }
        else{
            System.out.println("ZAKUP AUTA: porażka, zmień pracę");
        }
    }
}