package com.company.device;

abstract public class Device {
    public final String producer;
    public final String model;
    public final Integer productionYear;


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
}
