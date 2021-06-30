package com.company;

import com.company.device.Car;

public class Eletric extends Car{
    public Eletric(String producer, String model, Integer productionYear, Double millage, Double value) {
        super(producer, model, productionYear, millage, value);
    }

    @Override
    public void refuel() {
        System.out.println("Car is charging");
    }
}
