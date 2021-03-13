package com.company;

public class Phone {
    final String producer;
    final String model;
    final String operationSystem;
    final Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    String getOSVersion(){
        return "4.23.1";
    }
}
