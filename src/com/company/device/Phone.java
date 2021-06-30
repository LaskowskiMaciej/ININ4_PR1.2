package com.company.device;

public class Phone extends Device{
    final String operationSystem;
    private Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer productionYear) {
        super(producer, model, productionYear);
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

    @Override
    public void turnOn() {
        System.out.println("Uruchamianie systemu");
        System.out.println("Szukanie aktualizacji");
        System.out.println("Wszystko aktualne");
        System.out.println("Witaj");
    }
}
