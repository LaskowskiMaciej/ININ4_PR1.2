package com.company.device;

import com.company.Human;
import com.company.Salleable;

abstract public class Device implements Salleable {
    public final String producer;
    public final String model;
    public final Integer productionYear;
    public Double sumCarValues;


    protected Device(String producer, String model, Integer productionYear) {
        this.producer = producer;
        this.model = model;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer = '" + producer + '\'' +
                ", model= '" + model + '\'' +
                ", productionYear = " + productionYear +
                '}';
    }
    abstract public void turnOn();

    public Double carValues(){
        return sumCarValues;
    }
}
