package com.company;

import com.company.device.Car;

public class LPG extends Car {
    public LPG(String producer, String model, Integer productionYear, Double millage, Double value) {
        super(producer, model, productionYear, millage, value);
    }

    @Override
    public void refuel() {

    }
}
