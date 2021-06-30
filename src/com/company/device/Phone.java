package com.company.device;

public class Phone {
    public final String producer;
    final String model;
    final String operationSystem;
    private Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
    }

    public Double getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return this.producer + " " + this.model + " " + this.operationSystem  + " " + this.screenSize;
    }
}
